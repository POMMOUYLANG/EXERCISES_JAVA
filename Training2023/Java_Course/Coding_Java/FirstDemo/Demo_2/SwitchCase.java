package FirstDemo.Demo_2;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int month;
        int numberOfMonth = 0;
        System.out.print("Input Number: ");
        month = sc.nextInt();
        switch(month){
            case 1: numberOfMonth = 31; break;
            case 2: 
                System.out.print("Inout Year : ");
                int year = sc.nextInt();
                if(year % 4 == 0){
                    numberOfMonth = 29;
                }else{
                    numberOfMonth = 28;
                }
            break;
            case 3: numberOfMonth = 31; break;
            case 4: numberOfMonth = 30; break;
            case 5: numberOfMonth = 31; break;
            case 6: numberOfMonth = 30; break;
            case 7: numberOfMonth = 31; break;
            case 8: numberOfMonth = 31; break;
            case 9: numberOfMonth = 30; break;
            case 10: numberOfMonth = 31; break;
            case 11: numberOfMonth = 30; break;
            case 12: numberOfMonth = 31; break;
        }
        sc.close();
        if(numberOfMonth != 0){
            System.out.println("Number Of Day : " + numberOfMonth);
        }else{
            System.out.println("Invalid month.");
        }
    }
}
