package FirstDemo.Demo_16_1;

public class BankAccount {
    private String accountNumber;
    private String accountName;
    private double balance;
    
    
    public BankAccount(String accountNumber, String accountName, double balance) {
        this.accountNumber = accountNumber;
        this.accountName = accountName;
        this.balance = balance;
    }


    public String getAccountNumber() {
        return accountNumber;
    }


    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }


    public String getAccountName() {
        return accountName;
    }


    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }


    public double getBalance() {
        return balance;
    }


    public void setBalance(double balance) {
        this.balance = balance;
    }


    @Override
    public String toString() {
        return "BankAccount [accountNumber=" + accountNumber + ", accountName=" + accountName + ", balance=" + balance
                + "]";
    }

    
    
}
