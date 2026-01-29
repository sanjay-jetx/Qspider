package OOPS_Project;

public class SavingsAccount extends BankAccount {

    public SavingsAccount(double a) {
        balance = a;
    }

    @Override
    public double withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Savings: Withdrawal successful");
        } else {
            System.out.println("Savings: Insufficient balance");
        }
        return balance;
    }
}
