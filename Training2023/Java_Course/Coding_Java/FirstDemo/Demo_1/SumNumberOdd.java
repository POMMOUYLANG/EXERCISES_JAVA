import java.util.Scanner;

public class SumNumberOdd {
    public static void main(String[] args) {
        // Add number  1 + 3 + 5 + 7 
        Scanner sc = new Scanner(System.in);
        System.out.print("Input Number: ");
        int num = sc.nextInt();

        for(int i = 1 ; i <=num; i = i + 2){
            if(i == 1){
                System.out.print("  " + i);
            }
            else{
                System.out.print(" + " + i);
            }
        }
        sc.close();
    }
}
