package FirstDemo.Demo_3;

import java.util.Arrays;

public class ArrayOperation_4 {
    public static void main(String[] args) {
        // updateElement();
        updateManyElement();
    }
    //Update of array
    public static void updateElement(){
        int[] a = new int[] {23,54,64,20,64};
        int indexToUpdate = 2;
        int newValue = 100;
        // {23,54,64,20,64} = update {23,54,100,20,64}
        System.out.println(Arrays.toString(a));
        a[indexToUpdate] = newValue;
        System.out.println(Arrays.toString(a));

    }
    //Update Many Element
    public static void updateManyElement(){
        int[] a = new int[] {23,54,64,20,84};
        //any element which is greater than 60 => and more  20
        System.out.println(Arrays.toString(a));
        for(int i=0; i<a.length; i++){
            if(a[i] > 60){
                a[i] = a[i] + 20;
            }
        }
        System.out.println(Arrays.toString(a));
    }
}

