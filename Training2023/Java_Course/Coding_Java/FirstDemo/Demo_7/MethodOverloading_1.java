package FirstDemo.Demo_7;

public class MethodOverloading_1 {
    public static void main(String[] args) {
        // printString("Welcome TO Cambodia.");
        // printInteger(23);

        // print("Welcome TO Cambodia.");
        // print(23);
        // print("Amount",100);

        // int[] a = new int[] {12,34,45,56,23};
        // print(a);

        // printNumber(23,34,45,56,20,23,100,200,3000);

        display("Coca",23,34,45,65,67);

    }
    //Print String 
    public static void printString(String text){
        System.out.println(text);
    }
    //Print Integer
    public static void printInteger(int num){
        System.out.println(num);
    }
    // overloading : have class of method with the same name and different of parameter.
    public static void print(String text){
        System.out.println(text);
    }
    public static void print(int number){
        System.out.println(number);
    }
    public static void print(String property, int value){
        System.out.println(property + " = "+ value);
    }
    public static void print(int[] numbers){
        for(int n : numbers){
            System.out.println(n);
        }
    }
    //*varArg = array  
    public static void printNumber(int... number){
        for(int n : number){
            System.out.println(n);
        }
    }
    public static void display(String name, double... salary){
        System.out.println(name);
        for(int i=0; i<salary.length; i++){
            System.out.println(salary[i]);
        }
    }
}
