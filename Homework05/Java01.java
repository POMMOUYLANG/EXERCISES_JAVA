package Homework.Homework05;
import java.util.Scanner;
public class Java01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input number to list prime numbers from 2 to it: ");
        int num = sc.nextInt();
        for(int i=2; i<=num; i++){
            boolean isPrime = true;
            for(int j = 2; j<=i/2;j++){
                if(i % j == 0){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime){
                System.out.print(i+" ");
            }
        }
        System.out.println(" is Prime number.");
        sc.close();
        System.out.println();
    }
}
