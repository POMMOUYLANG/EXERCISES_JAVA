package Review.Function;

public class function_1 {
    public static void main(String[] args) {
        int[] a = new int[] {12,23,43,200,34,22,55};
        Student();
        sumNumber();
        sumNumberv2(a);
        
    }
    public static void Student(){
        System.out.println("Welcome To Cambodia.");
    }
    public static void sumNumber(){
        int[] a = new int[] {12,23,43,200,34,22,55};
        int sum = 0;
        for(int n : a){
            sum += n;
        }
        System.out.println("Total = "+ sum );
    }
    public static void sumNumberv2(int[] a){
         int sum = 0;
        for(int n : a){
            sum += n;
        }
        System.out.println("Total = "+ sum );
    }
}
