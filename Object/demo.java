import java.util.Scanner;

public class demo {
    static {
        System.out.println("Hello");
    }

    static void main(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        System.out.println("sum of array : "+sum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("tell how many times i have to print");
        int a = sc.nextInt();
        for (int j = 0; j < a; j++) {
            System.out.println("enter the size : ");
            int[] arr = new int[sc.nextInt()];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
            }
            main(arr);
        }
    }
}
