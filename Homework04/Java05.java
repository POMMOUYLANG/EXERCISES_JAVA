package Homework.Homework04;
import java.util.Scanner;
public class Java05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            int max = Integer.MIN_VALUE; // get value of the smallest integer

            System.out.println("Please enter 8 integers:");
    
            for (int i = 0; i < 8; i++) {
                int num = sc.nextInt();
                if (num > max) {    // compare num with max
                    max = num;
                }
            }
            System.out.println("The maximum number is: " + max);
            sc.close();
    }
}
