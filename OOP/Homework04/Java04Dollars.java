package Homework.Homework04;

public class Java04Dollars {
    private double amount;
    
    // create constructor to initialize amount
    public Java04Dollars(double amount) {
        this.amount = amount;
    }

    // create method to convert US Dollars to Riels
    public double toRiels() {
        return amount * 4000;
    }
    // create method to convert US Dollars to Thai Baht
    public double toBaht() {
        return amount * 32.5;
    }
    // create method to get amount
    public double getAmount() {
        return amount;
    }
}
