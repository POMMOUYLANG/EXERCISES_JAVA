package Homework.Homework04;

public class Java04Riels {
    private double amount;
    
    // create constructor to initialize amount
    public Java04Riels(double amount) {
        this.amount = amount;
    }

    // create method to convert Riels to US Dollars
    public double toUSD() {
        return amount / 4000;
    }
    // create method to convert Riels to Thai Baht
    public double toBaht() {
        return amount / 120;
    }
    // create method to convert Riels 
    public double getAmount() {
        return amount;
    }
}
