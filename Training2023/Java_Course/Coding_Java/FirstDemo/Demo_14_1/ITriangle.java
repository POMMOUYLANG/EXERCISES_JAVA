package FirstDemo.Demo_14_1;

public class ITriangle implements IPolygon{
    private double a;
    private double b;
    private double c;

    public ITriangle(){

    }
    
    public ITriangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    @Override
    public double getArea() {
        // double p = a*b*c / 2;
        double p = calcuatePerimeter()/2;
        double area = Math.sqrt(p*(p-a)*(p-b)*(p-c));
        return area;
    }

    @Override
    public double calcuatePerimeter() {
        return a + b + c;
    }

    @Override
    public void draw() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void version() {
        // TODO Auto-generated method stub
        
    }

    

    
}
