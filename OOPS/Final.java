public class Final {
    public static void main(String[] args) {

        int[] arr = {10, 20};

        swap(arr);

        System.out.println(arr[0] + " " + arr[1]); // 20 10
    }

    static void swap(int[] a) {
        int temp = a[0];
        a[0] = a[1];
        a[1] = temp;
    }
}
