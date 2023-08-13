package Homework.Homework05;
import java.util.Scanner;
public class Java02 {
    public int setNumber(int n) {
        if(0<=n && n<=500) {
            return n;
        }
        else {
            System.out.println("Error: input only allow between 0 and 500.");
            return 1;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Java02 ex2 = new Java02();
        System.out.print("Display odd number between 0 to 500: ");
        int n = ex2.setNumber(sc.nextInt());
        for(int i=1; i<n; i=i+2) {
            System.out.print(i + " ");
        }
        if(n%2 != 0) System.out.print(n + " ");
        System.out.println("is odd number.");
        sc.close();
    }
}