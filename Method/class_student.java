import java.util.Scanner;

public class class_student {
    
    //Main method
    public static void main(String[] args) {
        //function call

        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine();
        int age = sc.nextInt();
        int marks = sc.nextInt();

        info(name);
        info(name, age);
        info(name, age, marks);
    }
    
    // function decalartion

    public static void info(String name) {
        System.out.println(name);
    }

    public static void info(String name, int age) {
        System.out.println(name + " " + age);
    }

    public static void info(String name, int age, double marks) {
        System.out.println(name + " " + age + " " + marks);
    }
}
