public class SumNumber {
    public static void main(String[] args){
        // Sum = 1 + 2 + 3 + 4 + 5 + ... + 10
        // n_start & n_end
        // total_n * (n_start + n_end) / 2
        // Sum = 25 + 26 + 27 + 28
        // n_start & n_end
        // cardinal = n_end - n_start + 1
        // sum = cardinal * (n_start + n_end) / 2
        int n1 = 25;
        int n2 = 28;
        // int Sum = 10 * (n1 + n2)/2;
        int cardinal = n2 - n1 + 1;
        int Sum = cardinal * (n1 + n2) / 2;
        System.out.println("Sum = " + Sum);

    }
}
