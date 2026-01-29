package OOPS_Project;

public class CurrentAccount extends BankAccount {

    double overdraftLimit = 5000;

    public CurrentAccount(double balance) {
        this.balance = balance;
    }

    @Override
    public double withdraw(double amount) {
        if (amount <= balance + overdraftLimit) {
            balance -= amount;
            System.out.println("Current: Withdrawal successful");
        } else {
            System.out.println("Current: Overdraft limit exceeded");
        }
        return balance;
    }
}

