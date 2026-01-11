
import java.util.Scanner;

public class leap_year {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the A");
        int a = sc.nextInt();

        switch ((a % 400 == 0 || (a % 4 == 0 && a % 100 != 0)) ? 1 : 0) {

            case 0: {
                System.out.println("it is not Leap year ");
                break;
            }

            case 1: {
                System.out.println("It is leap year ");
                break;
            }
        }
        sc.close();
    }
}