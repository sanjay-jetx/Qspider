public class add {
    public static void main(String[] args) {
        int balance = 300;
        System.out.println("Current balance:" + balance);
        System.out.printf("Transaction 1: Deposited 500\n Balance:%d", balance + 500);
        balance += 500;
        System.out.printf("\nTransaction 2: Debited with 200 \n Balance: %d", balance - 200);
        balance -= 200;
    }
}
