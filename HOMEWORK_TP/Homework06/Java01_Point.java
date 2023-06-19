package Homework.Homework06;
import java.util.Scanner;
public class Java01_Point {
        private int x;
        private int y;
    
        public Java01_Point() {}
        public Java01_Point(int x) {
            this.x = x;
            this.y = 0;
        }
        public Java01_Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
        public static void main(String[] args) {
            Java01_Point point = new Java01_Point();
            Java01_Circle circle = new Java01_Circle();
            Scanner sc = new Scanner(System.in);
            System.out.println("""
                ----------------------------------------
                                Circle
                ----------------------------------------""");
            System.out.println("Input Center:");
            System.out.print("      X:");
            point.x = sc.nextInt();
            System.out.print("      Y:");
            point.y = sc.nextInt();
            circle.setCircle(point.x, point.y);
    
            System.out.println("Input Point:");
            System.out.print("      X:"); 
            point.x = sc.nextInt();
            System.out.print("      Y:");
            point.y = sc.nextInt();
            circle.setPoint(point.x, point.y);
    
            System.out.println(" Length: " + circle.findLength());
            System.out.println("Surface: " + circle.findSurface());
            System.out.println(" Radius: " + circle.findRadius());
            sc.close();
        }
}
