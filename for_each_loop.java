import java.util.Scanner;
public class for_each_loop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the size of the array :");
        int[] arr = new int[sc.nextInt()];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("enter the element : " + i);
            arr[i] = sc.nextInt();
        }
        int max = arr[0];
        for (int i : arr) {
            if (max < i) {
                max = i;
            }
        }
        System.out.println("The max number of the array : " + max);
         sc.close();

    }
}
