package FirstDemo.Demo_2;

import java.util.Scanner;

public class DoWhileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // do while loop
        // print number from 1 to 5
        int i = 1;
        do{
            System.out.println(i);
            i++;
        }while(i<=5);

        // get n number from keyboard and sum 
        int j = 1, sum = 0;
        System.out.print("Input number : ");
        int n = sc.nextInt();
        do{
            System.out.print("Number "+j+ " : ");
            int num = sc.nextInt();
            sum = sum + num;
            j++;
        }while(j<=n);
        System.out.println("Total = " + sum);
        sc.close();
    }
}
