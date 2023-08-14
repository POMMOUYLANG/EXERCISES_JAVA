package FirstDemo.Demo_2;

public class Homework_2 {
    public static void main(String[] args) {
        // Sum 2 to 20 and don't give number division 5
        // For Loop
        int sum1 = 0;
        for(int i=2; i<=20; i++){
            if(i%5 != 0){
               sum1 = sum1 + i; 
            }
        }
        System.out.println("Total For For = " +sum1);

        // While Loop
        int sum2 = 0;
        int n=2 ;
        while(n<=20){
            if(n%5 != 0){
                sum2 = sum2 + n;  
            }n++;
        }
        System.out.println("Total For While = " +sum2);

        // Do...While Loop
        int sum3 = 0;
        int m=2;
        do{
            if(m%5 != 0){
                sum3 = sum3 + m;  
            }m++;
        }while(m<=20);
        System.out.println("Total For Do...While = " +sum3);

        // Break
        int sum4 = 0;
        for(int j=2; j<=20; j++){
            if(j%5 == 0){
               break;
            }else{
                sum4 = sum4 + j;    
            }
        }
        System.out.println("Total For Break = " +sum4);

        // Continue
        int sum5 = 0;
        for(int j=2; j<=20; j++){
            if(j%5 == 0){
               continue;
            }else{
                sum5 = sum5 + j;    
            }
        }
        System.out.println("Total For Continue = " +sum5);
    }
}
