package FirstDemo.Demo_8;

import java.util.Scanner;

public class bookUtils {
    
    public static String geString(String label){
        System.out.print(label);
        Scanner sc = new Scanner(System.in);
        //String text = sc.next();
        return sc.next();
    }

    public static double getDouble(String label){
        String text = geString(label);
        return Double.parseDouble(text);
        // Double amount = Double.parseDouble(text);
        // return amount;
    }
    /* 
        public double getDouble(String label){
        System.out.print(label);
        Scanner sc = new Scanner(System.in);
        Double amount = Double.parseDouble(sc.next());
        return amount;
        }
    */
}
