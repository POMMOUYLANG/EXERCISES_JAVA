package Homework.Homework03;
import java.util.Scanner;
public class Java01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input number of seconds: ");
        int num = sc.nextInt();
        int h,mn,s;
        h = (num / 60);
        mn = (num - (60 * h));
        s = (60 * (num - (mn + (h * 60))));
        System.out.print("Time corresponding to "+num+"seconds is 00:20:59 = "+h+"h:"+mn+"mn:"+s+"s.");
        sc.close();
    }
}