import java.util.Scanner;
public class SWITCH {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number :");
        int a = sc.nextInt();

        switch (a % 2) {
            case 0: {
                System.out.println("It is even number");
                break;
            }

            case 1: {
                System.out.println(" It is Odd number ");
                break;
            }

            default: {
                System.out.println("Thanks you");
            }
        }
        sc.close();
    }
}

