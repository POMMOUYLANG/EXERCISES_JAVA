package FirstDemo.Demo_2;

import java.util.Scanner;

public class ForLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for(int i=1; i<=10; i++){
            System.out.println("Welcome to Java");
        }

        // 1+2+3+...+n
        // 1*2*3*...*n
        int sum = 0;
        int mult = 1;
        for(int i=1; i<=5; i++){
            sum = sum + i;
            mult = mult * i;
        }
        System.out.println(sum);
        System.out.println(mult);

        // Find max number
        int n;
        System.out.print("Input N : ");
        n = sc.nextInt();
        int max = 0 ;
        for(int i=1; i<=n; i++){
            System.out.println("Number "+i+ " : ");
            int number = sc.nextInt();
            if(max < number){
                max = number;
            }
        }
        System.out.print(max);

        // Display all even number
        for(int i=1; i<=10; i++){
            if(i%2 == 0){
                System.out.println(i);
            }
        }
        
        // Display all odd number
        for(int i=1; i<=10; i++){
            if(i%2 != 0){
                System.out.println(i);
            }
        }
         sc.close();
    }
}
