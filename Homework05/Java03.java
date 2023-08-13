package Homework.Homework05;
import java.util.Scanner;
public class Java03 {
    public int setNumber(int n) {
        if(0<=n && n<=500) {
            return n;
        }
        else {
            System.out.println("Error: input only allow between 0 and 500.");
            return 0;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Java03 ex2 = new Java03();
        System.out.print("Display odd number between 0 to 500: ");
        int n = ex2.setNumber(sc.nextInt());
        for(int i=0; i<n; i=i+2) {
            System.out.print(i + " ");
        }
        if(n%2 == 0) System.out.print(n + " ");
        System.out.println("is even number.");
        sc.close();
    }
}