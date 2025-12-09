import java.util.Scanner;
public class remaining_note {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the amount");
        int amount = sc.nextInt();
        int ruppes_500 = amount / 500;
        System.out.println("no of used 500 note : " + ruppes_500);
       
        amount = amount - ruppes_500 * 500;
        
        int ruppes_200 = amount / 200;
        System.out.println("no of used 200 note : " + ruppes_200);
        
        amount = amount - ruppes_200 * 200;

        int ruppes_50 = amount / 50;
        System.out.println("no of used 50 note : " + ruppes_50);  

    }
}
