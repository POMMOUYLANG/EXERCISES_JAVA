package FirstDemo.Demo_4;

public class Function_1 {
    public static void main(String[] args) {
        // saywelcome();
        // printArrayOld();
        // sumArrayElement();
    }
    
    // Void function without parameter
    // print text
    public static void saywelcome(){
        System.out.println("Hello Cambodia");
    }
    // print array element
    public static void printArrayOld(){
        int[] a = {25,45,64,34,75};
        for(int n : a){
            System.out.println(n);
        }
    }
    // Sum Array Element
    public static void sumArrayElement(){
        int[] a = {25,45,64,34,75};
        int sum = 0;
        for(int n : a){
            sum += n;
        }
        System.out.println("Total = " +sum);
    }
}
