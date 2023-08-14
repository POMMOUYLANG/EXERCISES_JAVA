package Review.Array;

import java.util.Arrays;

public class array_1 {
    public static void main(String[] args) {
        int[] a = new int[] {12,23,34,45,56};
        for(int i=0; i<a.length; i++){
            System.out.println(" "+a[i]);
        }

        System.out.println(Arrays.toString(a));
        int sum = 0;
        for(int n : a){
            sum += n;
        }
        System.out.println("Total = "+sum);

        int sum1 = 0;
        for(int n : a){
            if(n%2 == 0){
                sum1 += n;
            }
        }
        System.out.println("Total = "+sum1);
    }

}
