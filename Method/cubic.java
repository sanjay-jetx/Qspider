
// cubic 
import java.util.Scanner;

public class cubic {
    public static void printCube(int a) {
        System.out.println(a * a * a); // prints cube
    }

    public static void main(String[] args) {
        area_circle(3); // calculates area of circle with radius 3

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number for cubic : ");
        printCube(sc.nextInt());
        sc.close(); // cube of user input
    }

    public static void area_circle(int r) {
        System.out.println("radius : " + r);

        double area = 3.14 * r * r;
        System.out.println(area);
    }
}
