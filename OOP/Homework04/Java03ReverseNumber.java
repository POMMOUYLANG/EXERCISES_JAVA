package Homework.Homework04;
public class Java03ReverseNumber {
    private int number;
    public Java03ReverseNumber(int number) {
        this.number = number;
    }
    // create method to check validity of number
    public boolean isValid() {
        return number >=1000 && number <= 9999;
    }
    // create method to reverse number
    public int reverse() {
        int reversed = 0;
        while (number != 0) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number /= 10;
        }
        return reversed;
    }
}
