public class basic {
    public static void main(String[] args) {
        int lh = 0;
        int[] arr = { 1, 2, 3, 4, 5, 6 };
        int rh = arr.length - 1;
        while (lh < rh) {
            if (rh % 2 == 0) {
                int temp = arr[rh];
                arr[rh] = arr[lh];
                arr[lh] = temp;
                rh--;
            }
            // rh--;
            lh++;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
