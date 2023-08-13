package Homework.Homework05;
import java.util.Scanner;
public class Java06 {
    //Reverse String
    public String revString(String word) {
        String revWord = "";
        char ch;
        for(int i=0; i<word.length(); i++) {
            ch = word.charAt(i);
            revWord = ch + revWord; 
        }
        return revWord;
    }
    //Make Palindrome
    public String makePalindrome(String word) {
        return word + revString(word);
    }
    //Main
    public static void main(String[] args) {
        Java06 ex6 = new Java06();
        Scanner sc = new Scanner(System.in);
        System.out.print("Please input a word: ");
        String word = sc.nextLine();
        System.out.println(ex6.makePalindrome(word));
        sc.close();
    }
}
