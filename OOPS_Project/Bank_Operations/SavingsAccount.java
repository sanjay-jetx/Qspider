package Bank_Operations;

public class SavingsAccount extends BankAccount {

    public SavingsAccount(double balance) {
        super(balance);
    }

    @Override
    public double withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        }
        return balance;
    }
}

