package FirstDemo.Demo_15;

import java.util.Arrays;

public class PolymorphismApp {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[]{
            new Circle(5),
            new Rectangle(4,5),
            new Circle(4),
            new Triangle(3,4,5),
            new Rectangle(2,4),
        };

        // Arrays.sort(shapes);

        // SortShapeByArray sortShapeByArray = new SortShapeByArray();
        // Arrays.sort(shapes, sortShapeByArray);

        Arrays.sort(shapes, new SortShapeByArray());

        for(Shape shape : shapes){
            shape.display();
        }
        //Sum of totalArea
        double totalArea = 0;
        for(Shape shape : shapes){
            totalArea += shape.getArea();
        }
        System.out.println(totalArea);





        // Shape[] shapes = new Shape[5];
        // shapes[0] = new Circle(5);
        // shapes[0] = new Rectangle(4,5);
        // shapes[0] = new Triangle(3,5,6);
    }




    void test(){
        // Shape shape = new Circle();
        // shape.draw();

        // Shape shape = new Shape();
        // shape.draw();
        // Circle circle = new Circle();
        // circle.draw();
        // circle.draw(5.5);
        // Rectangle rectangle = new Rectangle();
        // rectangle.draw();
    }
}
