public class move_zer0 {

    public static void zero() {
        int[] a = { 1, 20, 9, 0, 8, 0, 2, 1 };
        int lh = 0, rh = a.length - 1;

        while (lh < rh) {
            if (a[lh] == 0) {
                int temp = a[lh];
                a[lh] = a[rh];
                a[rh] = temp;
                rh--;
            } else {
                lh++;
            }
        }

        for (int x : a)
            System.out.print(x + " ");
        System.out.println();
    }

    public static void sumofarray() {
        int[] a = { 1, 2, 3, 4, 5, 6, 7, 8 };
        int k = 3;
        int sum = 0;
        int max;
        int n = a.length;

        for (int i = 0; i < k; i++)
            sum += a[i];

        max = sum;

        for (int i = 1; i < n - k + 1; i++) {
            sum = sum - a[i - 1] + a[i + k - 1];
            if (sum > max)
                max = sum;
        }

        System.out.println("Max sum = " + max);
    }
}
