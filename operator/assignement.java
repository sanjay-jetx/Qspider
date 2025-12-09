import java.util.Scanner;

public class assignement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int balance = 500;
        System.out.println("current value :" + balance);
        
        int deposit = 200;
        int deposit_2 = 300;
        int current = balance += deposit + deposit_2;
        System.out.println("current value :" + current);

        int transfer = 600;
        int debit = balance -= transfer;
        System.out.println("current value after transfer :" + debit);


    }
    
}
