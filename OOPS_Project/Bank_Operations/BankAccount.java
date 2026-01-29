package Bank_Operations;

public abstract class BankAccount {
    protected double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public abstract double withdraw(double amount);
}
