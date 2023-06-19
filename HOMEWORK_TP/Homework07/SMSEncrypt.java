package Homework.Homework07;

import java.util.Scanner;
import java.util.ArrayDeque;

public class SMSEncrypt {
    SMSList smsList = new SMSList();
    SMS sms;
    public void runSMSEncrpt() {
        Scanner sc = new Scanner(System.in);
        SMSEncrypt app = new SMSEncrypt();
        int choice;
        do {
            System.out.println("""
                    -------------- > Encrypt SMS < ---------------
                    1. Send new SMS with Encrypted content using password method
                    2. View SMS detail
                    3. List SMSes
                    4. Remove SMSes by index
                    5. Quit
                    """);
    
            System.out.print("Your choice: ");
            choice = sc.nextInt();
            sc.nextLine();
            switch(choice) {
                case 1:
                    app.sendSMS(sc);
                    break;
                case 2:
                    app.viewSMS(sc);
                    break;
                case 3:
                    app.listSMSes();
                    break;
                case 4:
                    app.removeSMS(sc);
                    break;
                case 5:
                    System.out.println("Thank you...!");
                    break;
                default :
                    System.out.println("Invalid Choice....");
            }

        } while(choice != 5);
    }

    public void sendSMS(Scanner sc) {
        System.out.println("\n-------------- > Send New SMS < ---------------");
        System.out.print("Your number: ");
        String senderNumber = sc.nextLine();

        System.out.print("Reciever Number: ");
        String recieverNunber = sc.nextLine();

        System.out.print("Title: ");
        String subject = sc.nextLine();

        System.out.print("Message: ");
        String content = sc.nextLine();

        System.out.println("\n ---- Set Password To Read Message ---- ");
        String password, rePassword;
        do {
            System.out.print("Password: ");
            password = sc.nextLine();
            System.out.print("Re-Password: ");
            rePassword = sc.nextLine();

            if(!password.equals(rePassword)) {
                System.out.println("Re-password is incorrect...., try again!");
            }
        } while(!password.equals(rePassword));

        try {
            content = CryptText.encryptText(content, password);
            System.out.println("Message sends successfully...!\n");        
        } catch (Exception e) {
            e.printStackTrace();
        }

        sms = new SMS(subject, senderNumber, recieverNunber, "Text", content, "New");
        smsList.add(sms);
    }

    public void viewSMS(Scanner sc) {
        System.out.println("\n-------------- > Read Last SMS < ---------------");

        ArrayDeque<SMS> messageList = smsList.getSmsList();
        sms = messageList.peekLast();

        System.out.println("\n-------------- > Message  < ---------------");
        System.out.println("Subject         : " + sms.getSubject());
        System.out.println("Sender Number   : " + sms.getSenderNumber());
        System.out.println("Reciever Number : " + sms.getReceiverNumber());
        System.out.println("Message         : " + sms.getContent());
        System.out.println("Type            : " + sms.getType());
        System.out.println("Status          : " + sms.getStatus());
        System.out.println("\n-------------------------------------------\n");

        // Update Status
        smsList.removeLast();
        sms.setStatus("read");
        smsList.add(sms);
        
    }
    public void listSMSes() {
        ArrayDeque<SMS> messageList = smsList.getSmsList();
        int index = 0;
        for(SMS ms : messageList) {
            System.out.println("\n-------------- > Message["+ index +"]  < ---------------");
            System.out.println("Subject:         " + ms.getSubject());
            System.out.println("Sender Number:   " + ms.getSenderNumber());
            System.out.println("Reciever Number: " + ms.getReceiverNumber());
            System.out.println("Message:         " + ms.getContent());
            System.out.println("Type:            " + ms.getType());
            System.out.println("Status:          " + ms.getStatus());
            System.out.println("\n-------------------------------------------");
            index ++;
        }
    }

    public void removeSMS(Scanner sc) {
        System.out.print("Remove Message at Index: ");
        int index = sc.nextInt();
        ArrayDeque<SMS> messageList = smsList.getSmsList();
        int i = 0;
        for( SMS m : messageList) {
            if(i == index) {
                smsList.remove(m);
                System.out.println("\n-------------- > Message["+ index +"]  < ---------------");
                System.out.println("Subject:         " + m.getSubject());
                System.out.println("Sender Number:   " + m.getSenderNumber());
                System.out.println("Reciever Number: " + m.getReceiverNumber());
                System.out.println("Message:         " + m.getContent());
                System.out.println("Type:            " + m.getType());
                System.out.println("Status:          " + m.getStatus());
                System.out.println("\n-------------------------------------------");
                System.out.println("Message remove successfully....\n");
                break;
            }
            i++;
        }
        
    }

}
