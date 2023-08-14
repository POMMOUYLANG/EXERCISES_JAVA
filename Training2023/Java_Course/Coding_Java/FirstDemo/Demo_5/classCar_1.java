package FirstDemo.Demo_5;

public class classCar_1 {
    //Field (variable)
    String color;
    int numberOfWheel;
    double price;
    boolean isDriver;

    //Function
    public static void car(){
        System.out.println("Car drive.");
    }
    //Methods 
    void drive(){
        System.out.println("Car drive.");
    }
    
    void info(){
        System.out.println("Color = "+color+"; Number of Wheel = "+ numberOfWheel+"; Price = "+price);
    }

    void infov2(){
        System.out.println("Color = %s Number of Wheel = %d Price = %f".formatted(color,numberOfWheel,price));
    }

    void infov3(){
        System.out.println(String.format("Color = %s Number of Wheel = %d Price = %f",color,numberOfWheel,price));
    }

    void driverv2(){
        isDriver = true;
    }
    void stop(){
        isDriver = false;
    }
    public static void main(String[] args) {
        classCar_1 car = new classCar_1();
        car.color = "Red"; 
        car.numberOfWheel = 23; 
        car.price = 12000.5; 
        // System.out.println(car.color);  
        // System.out.println(car.numberOfWheel);   
        // System.out.println(car.price);   
        
        car(); //function 
        car.drive(); //method
        car.info();
        // car.infov3();
        System.out.println(car.isDriver);
        car.driverv2();
        System.out.println(car.isDriver);
        car.stop(); 
        System.out.println(car.isDriver);

    }
}
