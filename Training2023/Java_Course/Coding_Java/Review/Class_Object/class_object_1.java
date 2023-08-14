package Review.Class_Object;

public class class_object_1 {
    String name;
    int age;
    double salary;

    void driving(){
        System.out.println("My Car is red.");
    }

    public static void car(){
        System.out.println("I love my Car.");
    }
    public static void main(String[] args) {
        class_object_1 myObj = new class_object_1();
        myObj.name = "Mouylang";
        myObj.age = 21;
        myObj.salary = 300.5;
        System.out.println(myObj.name);
        System.out.println(myObj.age);
        System.out.println(myObj.salary);
        myObj.driving();
        car();
    }
}

