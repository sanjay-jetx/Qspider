import java.util.Scanner;
public class marks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the phy marks : ");
        int phy = sc.nextInt();
        System.out.println("enter the che marks : ");
        int che = sc.nextInt();
        System.out.println("enter the bio marks : ");
        int bio = sc.nextInt();
        System.out.println("enter the math marks : ");
        int math = sc.nextInt();
        System.out.println("enter the comp marks : ");
        int comp = sc.nextInt();
       
        int total_marks = phy + che + bio + math + comp;
        System.out.println("total marks : " + total_marks);
       
        double percent = (total_marks / 500.0) * 100; 

        System.out.println(" total percent : " + percent);

        if (percent >= 90) {
            System.out.println("excellent ");
        }
        else if (percent >= 80 && percent < 90) {
            System.out.println(" very good ");
        }
        else if (percent >= 70 && percent < 80) {
            System.out.println("good ");
        }
        else if (percent >= 60 && percent < 70) {
            System.out.println(" average ");
        }
        
    }
}
