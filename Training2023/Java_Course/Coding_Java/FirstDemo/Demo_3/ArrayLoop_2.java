package FirstDemo.Demo_3;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayLoop_2 {
    public static void main(String[] args) {
        // findSum();
        // findAverage();
        // findMax();
        // checkNumber();
        // createArrayFromKeyboard();
        generateSquence();
    }
    // Test for array loop
    public static void array_test(){
        // loop for array
        int [] c = new int [5];
        c[0] = 25;
        c[1] = 30;
        c[2] = 45;
        c[3] = 50;
        c[4] = 60 ;
        for(int i=0; i<c.length; i++){
            if(c[i]%2 == 0){
                System.out.println(c[i]);
            }   
        }
        for(int element : c){
            System.out.println(element);
        }
        String[] name = {"Thida", "Lang", "Ousa", "Tey"};
        for(String n : name){
            // System.out.println(Arrays.toString(name));
            System.out.println(n);
        }
    }
    
    //generate squence
    public static void  generateSquence(){
        //5,9,13,17
        //4n + 5
        int[] a = new int[5];
        for(int i=0; i<a.length; i++){
            a[i] = 4*i + 5;
        }
        System.out.println(Arrays.toString(a));
        //2,4,6,8,10
        //2n + 2
        int[] b = new int[5];
        for(int i=0; i<b.length; i++){
            b[i] = 2*i + 2;
        }
        System.out.println(Arrays.toString(b));
    }

    //Create Array From Keyboard
    public static void createArrayFromKeyboard(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Please input n: ");
        int n = sc.nextInt();

        int[] a = new int[n];
        for(int i=0; i<n; i++){
            System.out.print("Number " +(i+1)+" : ");
            a[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(a));
        sc.close();
    }

    //CheckNumber
    public static void checkNumber(){
        int[] a = {10,20,30,40,50};
        int numberToFind = 50;
        int index = -1;
        for(int i=0; i<a.length; i++){
            if(numberToFind == a[i]){
                index = i ;
            }
        }
        if(index != -1){
            System.out.println("Number exist.");
        }else{
            System.out.println("Number is not exist.");
        }
    }
    // Find sum
    public static void findSum(){
        int[] e = {20,30,40,50};
        int sum = 0;
        // Case1
        for(int i=0; i<e.length; i++){
            sum += e[i];
        }
        System.out.println("Total = " + sum);
        // Case2
        // int[] f = {20,30,40,50};
        // for(int i : f){
        //     sum += i; 
        // }
        // System.out.println("Total = " +sum);
    }

    // Average
    public static void findAverage(){
        int[] a = {10,20,30,40,50};
        int numberElement = a.length;
        int total = 0;
        for(int n : a){
            total += n;
        }
        int avg = total / numberElement;
        System.err.println("Average = " + avg);
    }

    // Find Max
    public static void findMax(){
        int[] a = {10,20,30,40,50};
        int max = a[0];
        for(int n : a){
            if(max < n){
                max = n;
            }
        }
        System.out.println("MAx = " + max );
    }
}
