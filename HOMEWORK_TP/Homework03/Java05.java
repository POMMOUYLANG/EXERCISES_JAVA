package Homework.Homework03;
import java.util.Scanner;
public class Java05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Program for calculating duration of travel from ITC to Airport.");
        System.out.print("Please input traffic jam factor (in percentage [0-100]): ");
        float num = sc.nextFloat();

        // v = d/t
        float viteese = 30*(num/100);
        float duration = (7/viteese)*3600;

        int Hours = (int) duration / 3600; // find hour
        float Minute = (duration % 3600) / 60; // find minute
        float Second_Result = duration % 60; // find second

        System.out.printf("Traveling Duration = %d : %1.0f : %1.0f", Hours, Minute, Second_Result);
        sc.close();
    }
}
