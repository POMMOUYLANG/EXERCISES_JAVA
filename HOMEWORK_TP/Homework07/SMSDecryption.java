package Homework.Homework07;

import java.util.ArrayDeque;
import java.util.Scanner;

public class SMSDecryption {
    SMSList smsList = new SMSList();
    SMSEncrypt ec = new SMSEncrypt();  
    SMS sms;
    
    public void runSMSDecript() {
        Scanner sc = new Scanner(System.in);
        SMSDecryption dc = new SMSDecryption();
        
        int choice = 0;
        do{
            System.out.println("""
                -------------- > Decrypt SMS < ---------------
                1. List all SMSes
                2. View SMS Detail (decrypt content using password)
                3. View readable SMSes (all SMS that can be decrypted using given password)
                4. Remove SMSes by index
                5. Quit
                """);
            System.out.print("Choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch(choice) {
                case 1:
                    ec.listSMSes();
                    break;
                case 2:
                    dc.viewDecryptSMS(sc);
                    break;
                case 3:
                    dc.viewReadableSMS(sc);
                    break;
                case 4:
                    ec.removeSMS(sc);
                    break;
                case 5:
                    System.out.println("Thanks you");
                    break;
                default :
                    System.out.println("Invalid input....");

            }
        }while( choice != 5);

        
    }

    public void viewDecryptSMS(Scanner sc) {
        ArrayDeque<SMS> messageList = smsList.getSmsList();
        int index = 0;
        for(SMS ms : messageList) {
            System.out.println("\n-------------- > Message["+ index +"]  < ---------------");
            System.out.println("Subject:         " + ms.getSubject());
            System.out.println("Sender Number:   " + ms.getSenderNumber());
            System.out.println("Reciever Number: " + ms.getReceiverNumber());

            System.out.println("--------------------------------------");
            System.out.print("\tPassword: ");
            String password = sc.nextLine();
            String message = ms.getContent();

            //Decrypt Text
            try {
                message = CryptText.decryptText(ms.getContent(), password);
            } catch (Exception e) {
                System.out.println("Password Incorrect....");
            }

            System.out.println("--------------------------------------");
            System.out.println("Message:         " + message);
            System.out.println("Type:            " + ms.getType());
            System.out.println("Status:          " + ms.getStatus());
            System.out.println("\n-------------------------------------------");
            index ++;
        }
    }

    public void viewReadableSMS(Scanner sc) {
        System.out.println("-------------- > View Readable SMS < ---------------");
        System.out.print("Insert Password: ");
        String password = sc.nextLine();
        int canRead = 0;

        ArrayDeque<SMS> messageList = smsList.getSmsList();
        for(SMS m : messageList) {
            boolean passwordCorrect = false;
            String message = m.getContent();
            try {
                message = CryptText.decryptText(message, password);
                passwordCorrect = true;
                canRead ++;

            } catch (Exception e) {passwordCorrect = false;}

            if(passwordCorrect) {
                System.out.println("\n-------------- > Message < ---------------");
                System.out.println("Subject:         " + m.getSubject());
                System.out.println("Sender Number:   " + m.getSenderNumber());
                System.out.println("Reciever Number: " + m.getReceiverNumber());
                System.out.println("Message:         " + message);
                System.out.println("Type:            " + m.getType());
                System.out.println("Status:          " + m.getStatus());
                System.out.println("\n-------------------------------------------");
            }
        }

        if(canRead == 0) {
            System.out.println("Sorry, Invalid Password For All Message....");
        }
    }
}
