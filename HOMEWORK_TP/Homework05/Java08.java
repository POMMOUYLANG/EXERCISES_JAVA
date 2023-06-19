package Homework.Homework05;
import java.util.Scanner;
public class Java08 {
    public void menu() {
        System.out.print("""
                ***RangeUtil Class***
                1-Find even number
                2-Find odd number
                0-Exit
                -> Option:""");
    }
    public static void main(String[] args) {
        int option, stop;
        Java08 ce = new Java08();
        Scanner sc = new Scanner(System.in);
        do{
            ce.menu();
            option = sc.nextInt();
            CE1_RangeUtil ce1;
            switch(option){
                case 0:
                    System.out.println("Thanks for use our programs.");
                    break;
                case 1:
                    System.out.print(" Display even number between 0 to: ");
                    stop = sc.nextInt();
                    ce1 = new CE1_RangeUtil(2, 0, stop);
                    System.out.println(ce1.toString() + " is even number.");
                    break;
                case 2:
                System.out.print(" Display odd number between 0 to: ");
                stop = sc.nextInt();
                ce1 = new CE1_RangeUtil(2, 1, stop);
                System.out.println(ce1.toString() + " is odd number.");
                break;
                default:
                    System.out.println("Error: Option is not available!");
                    break;

            }
        }
        while(option != 0);
        System.out.println("------------------------------------");
        sc.close();
        
        
    }
    
}
