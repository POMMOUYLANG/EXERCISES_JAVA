package Homework.Homework03;

import java.util.Scanner;

public class Java03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Program for calculating cost of a call.");
        System.out.print("Please input Start Hours: ");
        float S_h = sc.nextFloat();
        System.out.print("Please input Start Minutes: ");
        float S_mn = sc.nextFloat();
        System.out.print("Please input Start Second: ");
        float S_s = sc.nextFloat();
        System.out.println();
        System.out.print("Please input End Hours: ");
        float E_h = sc.nextFloat();
        System.out.print("Please input End Minutes: ");
        float E_mn = sc.nextFloat();
        System.out.print("Please input End Second: ");
        float E_s = sc.nextFloat();

        //Find 
        float startSeconds = S_h* 3600 + S_mn * 60 + S_s;
        float endSeconds = E_h * 3600 + E_mn * 60 + E_s;
        float durationSeconds = endSeconds - startSeconds;
        
        // total duration
        int Hours = (int) durationSeconds / 3600; // find hour
        int Minute = (int) (durationSeconds % 3600) / 60; // find minute
        int Second_Result = (int) durationSeconds % 60;

        // find cost per minute
        float durationMinutes = (durationSeconds / 60);
        double cost = durationMinutes * 0.05;

        System.out.println("Total call duration: " + Hours + "h " + Minute + "m " + Second_Result + "s");
        System.out.printf("Total cost of this call: %1.4f $", cost);
        sc.close();
    }
}
