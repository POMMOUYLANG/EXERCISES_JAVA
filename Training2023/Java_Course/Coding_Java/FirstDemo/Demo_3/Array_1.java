package FirstDemo.Demo_3;

import java.util.Arrays;

public class Array_1 {

    public static void main(String[] args) {
        // datatype[] arrayname;

        // declaration
        // String[] arr = new String[5];
        // int [] score = new int [5];

        // initialize
        int[] a = {1, 3, 5, 7, 9};
        int[] b = new int[] {1, 3, 5, 7, 9};
        int [] c = new int [5];
        // System.out.println(a);
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
        c[0] = 25;
        c[1] = 35;
        c[2] = 45;
        c[3] = 55;
        c[4] = 65;

        System.out.println(Arrays.toString(c));
        System.out.println(c[0]);

    }
}
