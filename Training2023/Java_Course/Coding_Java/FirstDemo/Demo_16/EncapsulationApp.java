package FirstDemo.Demo_16;

public class EncapsulationApp {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        //rectangle.height = 10;
        rectangle.setHeight(4);
        //rectangle.width = 20;
        rectangle.setWidth(5);

        double area = rectangle.calculateArea();
        System.out.println(area);
    }
}
