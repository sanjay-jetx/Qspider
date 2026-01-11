import java.util.Scanner;

public class salary {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the salary : ");

        int salary = sc.nextInt();
        System.out.println("basic salary " + salary);
        double full_salary = 0;

        if (salary <= 10000) {
            int HRA = 20;
            int DA = 80;
            full_salary = salary + ((HRA / 100.0) * salary) + ((DA / 100.0) * salary);
        }

        else if (salary <= 20000) {
            int HRA = 25;
            int DA = 90;
            full_salary = salary + ((HRA / 100.0) * salary) + ((DA / 100.0) * salary);
        }

        else if (salary > 20000) {
            int HRA = 30;
            int DA = 95;
            full_salary = salary + ((HRA / 100.0) * salary) + ((DA / 100.0) * salary);
        }

        else {
            System.out.println("enter the proper input");
        }
        System.out.println("enter the experience ");
        int experience = sc.nextInt();

        if (experience > 3) {
            full_salary += 2500;
        }

        System.out.println("Total salary : " + full_salary);
        sc.close();
    }
}

