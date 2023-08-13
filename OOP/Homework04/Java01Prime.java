package Homework.Homework04;
public class Java01Prime {
    int num;
    int divisible;
    Java01Prime(int n){
        num = n;
    }
    boolean isPrime(){
        if(num <= 1){
            divisible = 1;
            return false;
        }
        for(int i=2; i<num; i++){
            if(num % i == 0){
                divisible = i;
                return false;
            }
        }
        return true;
    }
}
