package Bank_Operations;

public class BankMainAcc {
    public static void main(String[] args) {

        BankAccount acc1 = new SavingsAccount(10000);
        System.out.println("Savings Balance: " + acc1.withdraw(200));

        BankAccount acc2 = new CurrentAccount(10000);
        System.out.println("Current Balance: " + acc2.withdraw(200));
    }
}
