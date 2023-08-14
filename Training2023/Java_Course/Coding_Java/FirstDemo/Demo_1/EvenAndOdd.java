import java.util.Scanner;

public class EvenAndOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input Number: ");
        int num = sc.nextInt();

        int remainder = num % 2 ;
        if(remainder == 0){
            System.out.println("Even.");
        }else{
            System.out.println("Odd.");
        }
        sc.close();
    }
}
