package Homework.Homework05;
import java.util.Scanner;
public class CE1_RangeUtil {
    public int start, step, stop;

    public CE1_RangeUtil() {}
    public CE1_RangeUtil(int step, int start, int stop) {
        this.start = start;
        this.step = step;
        this.stop = stop;
    }
    public String toString() {
        String range = "";
        if(start<stop) {
            for(int i=start; i<=stop ; i = i+step) {
                if(i == start) {
                    range = range + i;
                }
                else {
                    range = range + ","+ i ; 
                }
            }
        }
        else {
            for(int i=start; i>=stop ; i = i-step) {
                if(i == start) {
                    range = range + i;
                }
                else {
                    range = range + ","+ i ; 
                }
            }  
        }
        return range;
    }
    public static void main(String[] args) {
        int start, step, stop;
        Scanner sc = new Scanner(System.in);
        System.out.println("""
                ------------------------------------
                           CE1-Range Util
                ------------------------------------
                """);
        System.out.println("Program for Range Util ");
        System.out.print("Start: ");
        start = sc.nextInt();
        System.out.print("Stop : ");
        stop = sc.nextInt();
        System.out.print("Step : ");
        step = sc.nextInt();
        
        CE1_RangeUtil ce1 = new CE1_RangeUtil(step, start, stop);
        System.out.println("Range start from " + start + " to " + stop + ": " + ce1.toString());
        System.out.println("------------------------------------");
        sc.close();
        
        
    }
}
