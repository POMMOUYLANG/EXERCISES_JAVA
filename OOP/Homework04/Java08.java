package Homework.Homework04;
import java.util.Scanner;
public class Java08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    while(1>0){
            System.out.print("""
            \n\n-------- Menu ---------
            1. Prime number
            2. Lucky number
            3. Reversing number
            4. Money exchange
            5. Max among 8 numbers
            6. Shipping
            7. Leap year
            0. Exit
            -----------------------
                """);
        System.out.print("Choose an option: ");
        int option = sc.nextInt();
            if(option == 2){
                Java02.main(args);
                break;
            }
            else if(option == 3){
                Java03.main(args);
            }
            else if(option == 4){
                Java04.main(args);
            }
            else if(option == 5){
                Java05.main(args);
            }
            else if(option == 6){
                Java06.main(args);
            }
            else if(option == 7){
                Java07.main(args);
            }
            else if(option == 1){
                Java01.main(args);
            }
            else if(option == 0){
                System.out.println("Goodbye!");
                System.exit(0);
            }
            else{
                System.out.println("Invalid option!");
                System.out.println("Please choose again!");  
            }
            sc.close();
        }
    }
}
