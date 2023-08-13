package Homework.Homework02;

import java.util.Scanner;

public class Java05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Program for guessing your luckiness.");
        System.out.print("Please input a positive number: ");
        int num = sc.nextInt();
        int s;
        s = num + 1;
        System.out.println("I got "+s+". I am luckier.");
        sc.close();
    }
}
