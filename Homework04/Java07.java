package Homework.Homework04;
import java.util.Scanner;
public class Java07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            System.out.print("Enter a year: ");
            int year = sc.nextInt();
            if(year < 1){
                   System.out.println("Invalid year");
            }
            else if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0){     // condition for leap year
                   System.out.println(year + " is a leap year");
            }
            else{
                   System.out.println(year + " is not a leap year");
            }
            sc.close();
    }
}
