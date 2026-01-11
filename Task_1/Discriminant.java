import java.util.*;

public class Discriminant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a: ");
        int a = sc.nextInt();

        System.out.print("Enter b: ");
        int b = sc.nextInt();

        System.out.print("Enter c: ");
        int c = sc.nextInt();

        int D = (b * b) - (4 * a * c);

        System.out.println("Discriminant = " + D);

        if (D > 0) {
            System.out.println("Roots are real and different.");
            double root1 = (-b + Math.sqrt(D)) / (2 * a);
            double root2 = (-b - Math.sqrt(D)) / (2 * a);
            System.out.println("Root 1 = " + root1);
            System.out.println("Root 2 = " + root2);

        } else if (D == 0) {
            System.out.println("Roots are real and equal.");
            double root = (-b) / (2.0 * a);
            System.out.println("Root = " + root);

        } else {
            System.out.println("Roots are imaginary.");
        }
        sc.close();
    }
}
