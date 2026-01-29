package Bank_Operations;

public class CurrentAccount extends BankAccount {

    public CurrentAccount(double balance) {
        super(balance);
    }

    @Override
    public double withdraw(double amount) {
        if (amount <= balance + 5000) {
            balance -= amount;
        }
        return balance;
    }
}


