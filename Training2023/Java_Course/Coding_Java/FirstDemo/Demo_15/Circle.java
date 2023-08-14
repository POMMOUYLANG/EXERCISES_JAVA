package FirstDemo.Demo_15;

public class Circle extends Shape{

    @Override
    public void draw() {
        System.out.println("Draw Circle");
    }
    public void draw(double radius){
        System.out.println("Draw circle with radius= "+radius);
    }
}
