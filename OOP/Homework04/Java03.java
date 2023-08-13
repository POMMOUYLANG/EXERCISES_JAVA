package Homework.Homework04;
import java.util.Scanner;
public class Java03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            System.out.println("Program for reversing a 4 digits number.");
            System.out.print("Please input 4 digits number: ");
            int number = sc.nextInt();
            // create object of ReverseNumber class
            Java03ReverseNumber reverseNumber = new Java03ReverseNumber(number);
            // check if number is valid
            if (reverseNumber.isValid()) {
                // reverse number
                int reversed = reverseNumber.reverse();
                System.out.println("=> After Reverse: " + reversed);
            } else {
                System.out.println("Invalid number! Please input 4 digits number.");
            }
            sc.close();
    }
}
