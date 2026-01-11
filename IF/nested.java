import java.util.Scanner;
public class nested {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the A :");
        int A = sc.nextInt();
        System.out.print("enter the B :");
        int B = sc.nextInt();
        if (A < B) {
            System.out.println("B is bigger : ");
        }
        else if (B < A) {
            System.out.println("A is bigger : ");
        }
        else if (A == B) {
            System.out.println("Both number are equal");
        }
        else {
            System.out.println("Error correct value ");
        }
        sc.close();
    }
}
