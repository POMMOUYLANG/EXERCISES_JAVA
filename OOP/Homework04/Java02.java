package Homework.Homework04;
import java.util.Scanner;
public class Java02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Program for testing for lucky number.");
        System.out.print("Please input 6 digits number: ");
        int num = sc.nextInt();
        // create object of LuckyNumber class
        Java02LuckyNumber ln = new Java02LuckyNumber(num);
        if(ln.isValid()){
            if(ln.isLucky()){
                System.out.printf("=> %d is a lucky number.\n", num);
            }
            else{
                System.out.printf("=> %d is not a lucky number.\n", num);
            }
        }
        else{
            System.out.println("Invalid number, please input only 6 digits number.");
        }
        sc.close();
    }
}
