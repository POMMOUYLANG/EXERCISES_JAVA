package Homework.Homework07;

public class Rectangle{ //classs
    int width;
    int height;
    public Rectangle(int width, int height){ //Construct
        this.width = width;
        this.height = height;
    }
    public int calculatePerimeter(){
        return (width + height) * 2;

    }
    public int calculateSurface(){
        return width * height;
    }
    
}
class RectangleTest{
    public static void main(String[] args) {
        Rectangle rec = new Rectangle(10,20);
        System.out.println("Perimeter: "+ rec.calculatePerimeter());
        System.out.println("surface: "+ rec.calculateSurface());
    }
}