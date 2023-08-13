package Homework.Homework02;

import java.util.Scanner;

public class Java04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Program for counting the number of hundreds.");
        System.out.print("Please input a positive number:");
        int num = sc.nextInt();
        int s = num/100;
        System.out.println("There are "+s+" hundred in number "+num+".");
        sc.close();
    }
}
