package FirstDemo.Demo_14_1;

public class IRectangle implements IPolygon{
    private double width;
    private double height;
    
    
    public IRectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Irectangle [width=" + width + ", height=" + height + ",Area= " + getArea()+ "]";
    }
    
    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public double calcuatePerimeter() {
        return (width + height) * 2;
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
