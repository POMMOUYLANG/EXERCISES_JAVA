package FirstDemo.Demo_15;

//Polymorphism 
// - Method overriding
// - Method overloading
// - Operator overloading
public abstract class Shape /*implements Comparable<Shape>*/{

    abstract double getArea();

    abstract String getType();

    public void display(){
        System.out.println(getType() + " , " + getArea());
    }

    public void draw(){
        System.out.println("Draw Shape....");
    }
    //Sorting Array
    /* 
    @Override
    public int compareTo(Shape other) {
        // return (int) (other.getArea() - this.getArea()); // 1 to n and n to 1
        return other.getType().compareTo(this.getType()); // z to a
    }
    */
}
