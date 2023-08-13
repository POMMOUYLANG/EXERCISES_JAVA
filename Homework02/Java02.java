package Homework.Homework02;
import java.util.Scanner;
public class Java02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Program for calculating perimeter and surface of a Rectangle.");
        System.out.print("Please input width (in meter):");
        int width = sc.nextInt();
        System.out.print("Please input height (in meter):");
        int height = sc.nextInt();
        int P,S ;
        P = (width + height)*2;
        S = (width*height);
        System.out.println("=> Perimeter = ("+width+" + "+height+") x 2 = "+P+" m");
        System.out.println("=> Surface   = "+width+" x "+height+" = "+S+" m^2");
        sc.close();
    }
}
