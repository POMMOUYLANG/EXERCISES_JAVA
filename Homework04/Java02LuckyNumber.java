package Homework.Homework04;
public class Java02LuckyNumber {
    private int number;
    // create constructor LuckyNumber(int num)
    public Java02LuckyNumber(int number){
        this.number = number;
    }
    // create method isLucky() to check whether the number is lucky number or not
    public boolean isLucky(){
        if(isValid()){
            int firstThreeDigits = number / 1000;
            int lastThreeDigits = number % 1000;
            int sumFirstThreeDigits = getSumOfDigits(firstThreeDigits);
            int sumLastThreeDigits = getSumOfDigits(lastThreeDigits);
            return sumFirstThreeDigits == sumLastThreeDigits;
        }else{
            return false;
        }
    }
    // create method isValid() to check whether the number is valid or not
    public boolean isValid(){
        return number >= 100000 && number <= 999999;
    }
    // create method getSumOfDigits(int num) to get the sum of digits of a number
    public int getSumOfDigits(int num){
        int sum = 0;
        while(num > 0){
            sum += num % 10;
            num /= 10;        
            // num = num / 10; condition: 111/10 = 11.1 => 11 so one time loop will be executed
        }
        return sum;
    }
}
