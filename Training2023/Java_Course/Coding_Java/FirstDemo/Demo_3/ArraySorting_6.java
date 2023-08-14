package FirstDemo.Demo_3;

import java.util.Arrays;

public class ArraySorting_6 {
    public static void main(String[] args) {
        int a[] = {50,43,53,23,59,25};
        System.out.println(Arrays.toString(a));
        for(int i=0; i<a.length; i++){
            for(int j=i+1; j<a.length; j++){
                if(a[i] > a[j]){
                    int tmp = a[i];
                    a[i] = a[j];
                    a[j] = tmp;
                }
            }        
        }
        System.out.println(Arrays.toString(a));
    }
}
