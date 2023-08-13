package Homework.Homework05;
import java.util.Scanner;
public class Java {
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
// public void scanText(String sentence) {
//     for(int i=0; i<sentence.length()-1; i++) {
//         char ch1 = sentence.charAt(i);
//         char ch2 = sentence.charAt(i+1);
//         if(ch1 == '\\' && ch2 == 'n') {
//             System.out.print("(new_Line)");
//             i++;
//         }
//         else if(ch1 == '\\' && ch2 == 't') {
//             System.out.print("(tab)");
//             i++;
//         }
//         else if(ch1 == '\\' && ch2 == '\\') {
//             System.out.print("(slash)");
//             i++;
//         }
//         else if(ch1 == '/' && ch2 == '/') {
//             System.out.print("(comment_Line)");
//             i++;
//         }
//         else if(ch1 == ':' && ch2 == ')') {
//             System.out.print("(smile)");
//             i++;
//         }
//         else {
//             System.out.print(ch1);
//             if(i==sentence.length()-2) {        // For last letter
//                 System.out.println(ch2);
//             }
//         }
//     }
// }
// public static void main(String[] args) {
//     String sentence;
//     Scanner sc = new Scanner(System.in);
//     Java07 ex7 = new Java07();
//     System.out.print("Input a sentence: ");
//     sentence = sc.nextLine();
//     System.out.println();
//     ex7.scanText(sentence);
//     sc.close();
// }

