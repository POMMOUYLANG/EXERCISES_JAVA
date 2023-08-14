package FirstDemo.Demo_4;

import java.util.Scanner;

public class Function_2 {
    public static void main(String[] args) {
        int[] a = {25,45,64,34,75};
        int[] b = {100,2000,64,34,75};
        // int[] c = {};
        // printArray(a);
        // printArray(b);
        // saywelcome("Cambodia");
        sumArray(a);
        sumArray(b);
        findPower(2, 3);
        // findMaxArray(a);
        // findMaxArray(c);
        // getArray(3);
        int result;
        result = getSumArray(b) + getSumArray(a);
        System.err.println(result);
        double total = Math.pow(3,4);
        System.out.println(total);
       
    }

    // Void function with parameter
    // function hava parameter
    public static void printArray(int[] a){
        for(int n : a){
            System.out.print(n + ", ");
        }
    }

    // function hava parameter
    public static void saywelcome(String countrt){
        System.out.println("Welcome to " + countrt);
    }

    // Sum Array have parameter
    public static void sumArray(int[] arr){
        int sum = 0;
        for(int n : arr){
            sum += n;
        }
        System.out.println("Total = " +sum);
    }

    //Find Power 
     public static void findPower(int n, int m){
        int result = 1;
        for(int i=1; i<=m; i++){
            result = result * n;
        }
        System.out.println("Result = "+result);
     }

     //Find Max of array
    public static void findMaxArray(int[] arr){
        int max = 0;
        if(arr.length != 0){
            for(int i=0; i<arr.length; i++){
            if(max < arr[i]){
                max = arr[i];
            }
        }
        System.out.println("Max = "+max);
        }else{
            System.out.println("Array Empty.");
        }
     }

     //Get array n element from keyborad
    public static void getArray(int n){
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            System.out.print("Element "+(i+1) +" : ");
            arr[i] = sc.nextInt();
        }
        printArray(arr);
        sc.close();
    }

    //Sum Array
    public static int getSumArray(int[] arr){
        int sum = 0;
        for(int n : arr){
            sum += n;
        }
        return sum;
    }
}
