package Homework.Homework03;

import java.util.Scanner;

public class Java02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Program for converting time to seconds.");
        System.out.print("Please input hours: ");
        int h = sc.nextInt();
        System.out.print("Please input minutes: ");
        int mn = sc.nextInt();
        System.out.print("Please input seconds: ");
        int s = sc.nextInt();
        int t = (h*3600)+(mn*60)+s;
        System.out.println("Number of seconds = "+h+" x 3600 + "+mn+" x 60 + "+s+" = "+t);
        sc.close();
    }
}
