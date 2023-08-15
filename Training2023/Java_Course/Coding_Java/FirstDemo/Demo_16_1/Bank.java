package FirstDemo.Demo_16_1;

public class Bank {
    private String bankName;
    private BankAccount[] bankAccounts;
    /* 
    
    */

    public Bank(String bankName, BankAccount[] bankAccounts) {
        super();
        this.bankName = bankName;
        this.bankAccounts = bankAccounts;
    }

    // getAccountByNumber(accountNumber)
     private BankAccount getBankAccountByNumber(String accountNumber){
        for(BankAccount ba : bankAccounts){
            if(ba.getAccountNumber().equals(accountNumber)){
                return ba;
            }
        }
        return null;
     }

     // isEnoughBalance (bankAccount,amount)
     private boolean isEnoughBalance(BankAccount bankAccount, double amount){
        /* 
        if(bankAccount.getBalance() >= amount){
            return true;
        }
        return false;
        */
        return bankAccount.getBalance() >= amount;
     }

     // isValidmount(amount)
     private boolean isValidmount(double amount){
        return amount > 0;
     }

     // withdraw(bankAccount, amount)
     private void withDraw(BankAccount bankAccount, double amount){
        double balance = bankAccount.getBalance() - amount;
        bankAccount.setBalance(balance);
     }

     //deposit(bankAccount, amount)
    private void deposit(BankAccount bankAccount, double amount){
        double balance = bankAccount.getBalance() + amount;
        bankAccount.setBalance(balance);
     }

     //Transfer(accountA, accountB, amount)
     public void Transfer(String accouSource, String accountTarget, double amount){
        BankAccount source = getBankAccountByNumber((accouSource));
        if(source == null){
            System.out.println("Invalid Source Account Number");
            return;
        }
        BankAccount target = getBankAccountByNumber(accountTarget);
        if(target == null){
            System.out.println("Invalid Target Account Number");
            return;
        }
        boolean isValidmount = isEnoughBalance(source, amount);
        if(!isValidmount){
            System.out.println("Banlance is not enough.");
            return;
        }
        if(!isValidmount(amount)){
            System.out.println("Amount must be greater than 0.");
            return;
        }
        withDraw(source, amount);
        deposit(target,amount);
     }

     public void displayAccount(){
        for(BankAccount bankAccount : bankAccounts){
            System.out.println(bankAccount.toString());
        }
     }
}
