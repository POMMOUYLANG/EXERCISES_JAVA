package FirstDemo.Demo_15;

public class Triangle extends Shape{

    private double a;
    private double b;
    private double c;

    

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public void draw() {
        System.out.println("Draw Triangle");
    }

    @Override
    double getArea() {
        double p = (a+b+c) / 2;
        return Math.sqrt(p*(p-a)*(p-b)*(p-c));
    }

    @Override
    String getType() {
        return "triangle";
    }
    
}
