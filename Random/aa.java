
import java.util.Scanner;

public class aa {
    public static void main(String[] args) {

        System.out.println((10 + "A"));
        System.out.println("heloo" + 10 + 30);
        System.out.println(10 + 30 + "hello");
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(a + b);

        float c = sc.nextFloat();
        float d = sc.nextFloat();
        System.out.println(c - d);
        sc.close();
    }
}
