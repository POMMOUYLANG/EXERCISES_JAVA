package FirstDemo.Demo_3;

import java.util.Arrays;

public class ArrayOperation_3 {
    public static void main(String[] args) {
        // createArray();
        // addNewArray();
        addNewElementAtSpecificIndex();
    }
    
    // Create Array 
    public static void createArray(){
        int[] a = new int[5];
        a[0] = 10;
        a[1] = 40;
        a[2] = 55;
        a[3] = 30;
        a[4] = 100;
        System.out.println(Arrays.toString(a));
    }

    // Add Array for ending
    public static void addNewArray(){
        int[] a = new int[] {23,54,64,20,64};
        //new element 38 
        // a = {23,54,64,20,64,38}
        int newElement = 38;
        // int[] b = new int[6];
        int[] b = new int[a.length + 1];
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));

        // Step copy
        for(int i=0; i<a.length; i++){
            b[i] = a[i]; 
        }
        // b[5] = newElement;
        b[b.length - 1] = newElement;

        // Display again
        System.out.println("=================");
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
    }

    // Add New Element At Specific Index
    public static void addNewElementAtSpecificIndex(){
        int[] a = new int[] {23,54,64,20,64};
        int indexToAdd = 1;
        int newValue = 38;
        int[] b = new int[a.length + 1];
        //Step 1
        for(int i=0; i<indexToAdd; i++){
            b[i] = a[i];
        }
        //Step2
        b[indexToAdd] = newValue;

        //Step3
        for(int i=indexToAdd + 1; i<b.length; i++){
            b[i] = a[i-1];
        }
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
    }
}

