package FirstDemo.Demo_15;

public class Rectangle extends Shape{

    private double width;
    private double height;

    

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public void draw() {
        System.out.println("Draw Rectngle");
    }

    @Override
    double getArea() {
        return width * height;
    }

    @Override
    String getType() {
        return "rectangle";
    }
}
