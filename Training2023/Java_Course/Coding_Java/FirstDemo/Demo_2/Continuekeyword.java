package FirstDemo.Demo_2;

import java.util.Scanner;

public class Continuekeyword {
    public static void main(String[] args) {
        // Continue is used skip any in loop
        for(int j = 1; j<=10; j++){
            if(j == 4){
                continue;
            }
            System.out.println(j);
        }
        // sum only even number 
        Scanner sc = new Scanner(System.in);
        System.out.print("Input : ");
        int n = sc.nextInt();
        int sum = 0;
        for(int a = 1; a<=n; a++){
            if(a % 2 == 0){
                sum = sum + a;
            }
        }
        System.out.println("Total = " +sum);

        // input n word then concat only word that has consonant ending
        System.out.print("Input  Number: ");
        int num = sc.nextInt();
        String text = " ";
        for(int i=1; i<=num; i++){
            System.out.print("Word- "+(i) + " : ");
            String word = sc.next();
            text += word + " ";
        }
        System.out.println(text);
        
        // find charAt() and length()
        String t = "School";
        System.out.println(t.charAt(5));
        System.out.println(t.length());
        
        char ch = 'E';
        System.out.println(Character.isAlphabetic(ch));
        
        if(Character.isAlphabetic(ch)){
            if(ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u'){
                System.out.println("Consonant");
            }else{
                System.out.println("Vowel");
            }
        }else{
            System.out.println("Not Letter");
        }
        
        
        sc.close();
    }
}
