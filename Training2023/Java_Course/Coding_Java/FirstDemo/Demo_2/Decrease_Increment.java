package FirstDemo.Demo_2;

public class Decrease_Increment {
    public static void main(String[] args) {
        // Increment 
        int i = 1;
        while(i<=5){
            System.out.println(i);
            i++;
        }
        // Decrease
        int j = 5;
        while(j > 1){
            System.out.println(j);
            j--;
        }

        for(int n =1; n<=5; n++){
            for(int a=1; a<=n; a++){
                System.out.print("$");
            }
            System.out.println( );
        }
    }
}
