package FirstDemo.Demo_3;

import java.util.Arrays;

public class ArrayOperation_5 {
    public static void main(String[] args) {
        deleteElement();
        // deleteManyElement();
    }
    //delete one element by index
    public static void deleteElement(){
        int[] a = new int[] {23,54,64,20,64};
        //{23,54,20,64}
        int indexToDelete = 2;
        int[] b = new int[a.length-1];
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
        //Step1
        for(int i=0; i<indexToDelete; i++){
            b[i] = a[i];
        }
        //Step2
        for(int i=indexToDelete; i<b.length; i++){
            b[i] = a[i+1];
        }
        a=b; 
        System.out.println(Arrays.toString(a));
        // System.out.println(Arrays.toString(b));
    }
    //delete many element by value
    public static void deleteManyElement(){
        int[] a = new int[] {23,54,64,20,64,40,100,200,40,40};
        int valueToDelete = 40;
        int count = 0;

        for(int i=0; i<a.length; i++){
            if(a[i] == valueToDelete){
                count++;
            }
        }
        int[] b = new int[a.length - count];
        int index = 0;
        for(int i=0; i<a.length; i++){
            if(a[i] != valueToDelete){
                b[index] = a[i];
                index++;
            }
        }
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
    }
    //delete first element by value
    public static void deletefirstElement(){
        // int[] a = new int[] {23,54,64,20,64,40,100,200,40,40};
        
    }
}

