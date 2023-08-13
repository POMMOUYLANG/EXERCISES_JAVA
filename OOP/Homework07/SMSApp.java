package Homework.Homework07;

import java.util.Scanner;

public class SMSApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SMSEncrypt smsEncrypt = new SMSEncrypt();
        SMSDecryption smsDecrypt = new SMSDecryption();

        System.out.println("\t\tWelcome To SMS App");
        int choice ;
        do{
            System.out.println("""
                    --------------------------------- SMS APP ---------------------------
                    1. RUN SMS Encryption (Sender)
                    2. RUN SMS Decryption (Receiver)
                    3. EXIT
                    """);
            System.out.print("Choice:");
            choice = sc.nextInt();
            sc.nextLine();

            switch(choice) {
                case 1:
                    smsEncrypt.runSMSEncrpt();
                    break;
                case 2:
                    smsDecrypt.runSMSDecript();
                    break;
                case 3: 
                    System.out.println("Thank you...");
                    break;
                default :
                    System.out.println("Invalid choice ...");
            }
        } while( choice != 3);
        sc.close();
    }
}
