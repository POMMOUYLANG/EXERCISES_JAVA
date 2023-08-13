package Homework.Homework06;
public class Java01_Circle {
    int xCenter, yCenter;
    int  xP, yP;

    public Java01_Circle() {}
    
    public Java01_Circle(int xCenter, int yCenter, int xP, int yP) {
        this.xCenter = xCenter;
        this.yCenter = yCenter;
        this.xP = xP;
        this.yP = yP;
    }

    public void setCircle(int x, int y) {
        xCenter = x;
        yCenter = y;
    }

    public void setPoint(int x, int y) {
        xP = x;
        yP = y;
    }

    public double findRadius() {
        double radius = Math.sqrt((this.xP-this.xCenter)*(this.xP-this.xCenter) + (this.yP-this.yCenter)*(this.yP-this.yCenter));
        return radius;
    }

    public double findLength() {
        double radius = findRadius();
        double length = 2 * 3.14 * radius;
        return length;
    }

    public double findSurface() {
        double radius = findRadius();
        double surface = 3.14 * radius * radius;
        return surface;
    }
}
