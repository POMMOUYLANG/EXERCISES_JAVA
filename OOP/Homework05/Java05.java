package Homework.Homework05;
import java.util.Scanner;
public class Java05 {
    public String setWord(String word) {
        if(word.length() == 1) {
            System.err.println("Error: Please input more than one letter!");
        }
        return word;
    }
    //Loop Method
    public boolean loop(String word) {
        char head, tail;
        for(int i=0; i<word.length()/2; i++) {
            head = word.charAt(i);
            tail = word.charAt((word.length()-1)-i);
            if(head != tail) {
                return false;
            }
        }
        return true;
    }
    //Reverse Method
    public boolean reverse(String word) {
        String revWord = "";
        char ch;
        for(int i=0; i<word.length(); i++) {
            ch = word.charAt(i);
            revWord = ch + revWord; 
        }
        if(revWord.compareTo(word) == 0) {
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        String word, methods;
        boolean palindrome = false;
        Java05 ex5 = new Java05();
        Scanner sc = new Scanner(System.in);
        do{
           System.out.print("Please give a word to check: ");
            word = ex5.setWord(sc.nextLine());
        }
        while(word.length() == 1);
        
        do {
            System.out.print("Choose method (REV, LOOP) : ");
            methods = sc.nextLine();
            if(methods.compareTo("REV") == 0) {
            palindrome = ex5.reverse(word);
            }
            else if(methods.compareTo("LOOP") == 0){
                palindrome = ex5.loop(word);
            }
            else {
                System.out.println("Error: Methods in not availible!");
            }
        }
        while(methods.compareTo("REV") != 0 && methods.compareTo("LOOP") != 0);
        if(palindrome) {
            System.out.println(word + " is a Palindrome.");
        }
        else {
            System.out.println(word + " is not a Palindrome.");
        }
        sc.close();
        
    }
}
