import java.util.Scanner;
public class if_else {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the A : ");
        int a = sc.nextInt();
        System.out.print("enter the B : ");
        int b = sc.nextInt();
        if (a > b) {
            System.out.println("A is bigger than B");
        }
        else {
            System.out.println("B is bigger than A");
        }
    }
}
