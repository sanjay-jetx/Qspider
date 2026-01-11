import java.util.*;
public class ascci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the charater :");
        char ch = sc.next().charAt(0);

        int a = (int) ch;
        
        if(a >= 65 && a <= 90 ){
            System.out.println("it is uppercase");
        }
        else if (a >= 97 && a <= 122) {
            System.out.println("it is lowercase");
        }
        else {
            System.out.println("enter the valid char");
        }
        sc.close();
    }
}
