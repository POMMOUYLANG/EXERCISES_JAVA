package Homework.Homework04;
import java.util.Scanner;
public class Java04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean exit = false;

        System.out.println("Welcome to program Money Exchanges!");

        while (!exit) {
            System.out.println("====================================");
            System.out.println(" 1. Riels to Dollar");
            System.out.println(" 2. Riels to Thai Baht");
            System.out.println(" 3. Dollar to Riels");
            System.out.println(" 4. Dollar to Thai Baht");
            System.out.println(" 5. Thai Baht to Riels");
            System.out.println(" 6. Exit");
            System.out.println("====================================");

            // input choice
            System.out.print("Choose an option: ");
            int option = sc.nextInt();


            if(option == 1){
                System.out.print("\nEnter amount in Riels: ");
                double amount = sc.nextDouble();                              // get amount of money

                Java04Riels riel = new Java04Riels(amount);                               // create object of Riels class
                System.out.println("Amount in US Dollars: " + riel.toUSD());  // display amount in US Dollars
            } else if(option == 2){
                System.out.print("Enter amount in Riels: ");
                double amount = sc.nextDouble();

                Java04Riels riel = new Java04Riels(amount);
                System.out.println("\nAmount in Thai Baht: " + riel.toBaht());
            } else if(option == 3){
                System.out.print("Enter amount in US Dollars: ");
                double amount = sc.nextDouble();

                Java04Dollars dollar = new Java04Dollars(amount);
                System.out.println("\nAmount in Riels: " + dollar.toRiels());
            } else if(option == 4){
                System.out.print("Enter amount in US Dollars: ");
                double amount = sc.nextDouble();

                Java04Dollars dollar = new Java04Dollars(amount);
                System.out.println("\nAmount in Thai Baht: " + dollar.toBaht());
            } else if(option == 5){
                System.out.print("Enter amount in Thai Baht: ");
                double amount = sc.nextDouble();

                Java04Baht baht = new Java04Baht(amount);
                System.out.println("Amount in Riels: " + baht.toRiels());
            } else if(option == 6){
                exit = true;
                System.out.println("Thank you for using our program!");
            } else {
                System.out.println("Invalid option! Please choose again.");
            }
            sc.close();
        }
    }
}
