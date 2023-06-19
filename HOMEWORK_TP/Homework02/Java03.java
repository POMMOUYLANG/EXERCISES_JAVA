package Homework.Homework02;

import java.util.Scanner;

public class Java03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Program for calculating equation 1/x = 1/y + 1/z");
        System.out.print("Please input y:");
        float y = sc.nextFloat();
        System.out.print("Please input z:");
        float z = sc.nextFloat();
        float x,t;
        t = (1/y) + (1/z);
        x = (1/t);
        System.out.println("=> Result x = "+x);
        sc.close();
    }
}
