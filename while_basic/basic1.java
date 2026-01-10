import java.util.Scanner;
public class basic1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch;
        do {
            System.out.println("Welcome ");
            System.out.println("do u want me to print again");
            ch = sc.next().charAt(0);

        } while (ch == 'y' || ch == 'Y');
        sc.close();
    }
}
