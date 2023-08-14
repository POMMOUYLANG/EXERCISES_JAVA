package FirstDemo.Demo_14_1;

public class PolugonApp {
    public static void main(String[] args) {
        IRectangle iRectangle = new IRectangle(4, 5);
        // iRectangle.getArea();
        // System.out.println(iRectangle);
        // System.out.println(iRectangle.getArea());
        iRectangle.infor();
        IPolygon.test();
        
        // System.out.println(iRectangle.calcuatePerimeter());
        
        ITriangle iTriangle = new ITriangle(3, 5, 6);
        // System.out.println(iTriangle.getArea());
        // System.out.println(iTriangle.calcuatePerimeter());

    }
}
