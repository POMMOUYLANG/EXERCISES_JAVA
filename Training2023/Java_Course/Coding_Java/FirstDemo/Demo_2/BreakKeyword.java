package FirstDemo.Demo_2;

import java.util.Scanner;

public class BreakKeyword {
    public static void main(String[] args) {
        // break is used to exit loop
        // 1 to 10, sum only first 3 number
        int sum = 0;
        for(int i =1; i<=10; i++){
            System.out.println(i);
            sum += i;
            if(i == 3 ){
                break;
            } 
        }
        System.out.println("Total : " + sum);

        // input any number nonstop if not even number.
        Scanner sc = new Scanner(System.in);
        int j = 1;
        while(true){
            System.out.print("Number " +j+ ": ");
            int number = sc.nextInt();
            j++;
            if(number % 2 == 0){
                break;
            }
        }






        sc.close();
    }
}
