package Homework.Homework03;

import java.util.Scanner;

public class Java04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Program for converting money in Riels to Dollars.");
        System.out.println("Conversion rate is: 1 USD = 4000 RIELS");
        System.out.print("Please input money in Riels: ");
        int R = sc.nextInt();
        double Dollar = (double)R / 4000;
        System.out.println(+R+" RIELS = "+Dollar+" USD");
        sc.close();
    }
}
