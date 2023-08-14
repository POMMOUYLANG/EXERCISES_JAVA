import java.util.Scanner;

public class SumToNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input Number 1: ");
        int num1 = sc.nextInt();
        System.out.println("Input Number 2: ");
        int num2 = sc.nextInt();
        
        int total = num1 + num2;
        System.out.println("Sum = " + total);
        sc.close();
    }
}
