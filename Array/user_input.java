import java.util.Arrays;
import java.util.Scanner;

public class user_input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the size of the array :");
        int size = sc.nextInt();

        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("enter the value  : " + i);
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        sc.close();

    }
}
