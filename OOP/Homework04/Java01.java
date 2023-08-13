package Homework.Homework04;
import java.util.Scanner;
public class Java01 {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("\nInput number: ");
            Java01Prime p = new Java01Prime(sc.nextInt());
            if(p.isPrime()){
                System.out.printf("%d Prime",p.num);
            }else{
                System.out.printf("%d is not Prime numeber, because it is divisible to ",p.num);
                System.out.print(p.divisible);
            }
            sc.close();
    }
}
