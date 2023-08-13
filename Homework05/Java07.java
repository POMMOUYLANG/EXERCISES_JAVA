package Homework.Homework05;
import java.util.Scanner;
public class Java07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input String : ");
        String str = sc.nextLine();
        str = str.replace("\\n", "(new_line)");
        str = str.replace("\\t", "(Tab)");
        str = str.replace("\\\\", "(slash)");
        str = str.replace("////", "(comment_line)");
        str = str.replace(":)", "(smile)");
        System.out.println(str);
        sc.close();
    }
}
