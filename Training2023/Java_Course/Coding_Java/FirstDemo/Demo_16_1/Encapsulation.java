package FirstDemo.Demo_16_1;

public class Encapsulation {
    public static void main(String[] args) {
        BankAccount[] bankAccounts = {
            new BankAccount("001", "dara", 300),
            new BankAccount("002", "lang", 350),
            new BankAccount("003", "lala", 250),
        };

        Bank bank = new Bank("ABA", bankAccounts);
        bank.displayAccount();
        System.out.println("=============================");
        bank.Transfer("001", "003", 100);
        bank.displayAccount();
    }
}
