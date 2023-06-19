package Homework.Homework04;

public class Java04Baht {
    private double amount;
    
    // create constructor to initialize amount
    public Java04Baht(double amount) {
        this.amount = amount;
    }
    // create method to convert Thai Baht to US Dollars
    public double toUSD() {
        return amount / 32.5;
    }
    // create method to convert Thai Baht to Riels
    public double toRiels() {
        return amount * 120;
    }
    // create method to get amount
    public double getAmount() {
        return amount;
    }
}
