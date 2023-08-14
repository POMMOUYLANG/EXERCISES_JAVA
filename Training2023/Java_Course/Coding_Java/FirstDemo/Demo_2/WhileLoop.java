package FirstDemo.Demo_2;

import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // While loop
        // print number from keyword and sum 
        int j = 1;
        int m = 5;
        while(j<=m){
            System.out.println(j);
            j++;
        }
        
        // get n number from keyboard and sum and sum on even number
        System.out.print("Input number : ");
        int n = sc.nextInt();
        int i = 1, sum = 0;
        while(i<=n){
            System.out.print("Number " + i+ " : ");
            int number = sc.nextInt();
           if(number % 2 == 0){
             sum = sum + number;
           }
            i++;
        }
        System.out.println("Total = "+ sum);
        
        sc.close();
    }
}
