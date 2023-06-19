package Homework.Homework05;
import java.util.Scanner;
public class Java04 {
    public static void main(String[] args) {
        double profits = 0, totalProfits = 0;
        Scanner sc = new Scanner(System.in);
        for(int i=1; i<=12; i++) {
            System.out.printf("Profit for month %-2d :",i);
            profits = sc.nextDouble();
            totalProfits += profits;
        }
        System.out.printf("\nTotal profits for 12 months : %.2f \n",totalProfits);
        sc.close();
    }
}