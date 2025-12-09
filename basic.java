import java.util.Scanner;


public class basic {
    public static void main(String[] args) {

        Scanner new1 = new Scanner(System.in);
        System.out.print("enter the age : ");
        byte age = new1.nextByte();

        System.out.print("enter the STD : ");
        int STD = new1.nextInt();

        System.out.print("enter the sec");
        String SEC = new1.next();

        System.out.print("enter the mobile no : ");
        long num = new1.nextLong();

        System.out.println(age);
        System.out.println(STD);
        System.out.println(SEC);
        System.out.println(num);

    }
}