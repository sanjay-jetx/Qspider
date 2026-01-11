import java.util.*;
public class basic22Darray {
    public static void main(String[] args) {
        // int[][] arr = new int[3][3];

        Scanner sc = new Scanner(System.in);
        int[][] arr = {
                { 1, 2, 3 },
                { 1, 2,},
                { 1, 2, 3,4,5}
        };
        System.out.println(Arrays.deepToString(arr));
        System.out.println(Arrays.toString(arr));

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }

        int[][] arr1 = new int[3][3];
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                arr1[i][j] = sc.nextInt();
            }
        }
        System.out.println(Arrays.deepToString(arr1));
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(Arrays.toString(arr1[i]));
        }
        sc.close();

    }
}
