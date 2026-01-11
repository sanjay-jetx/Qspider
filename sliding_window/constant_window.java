

public class constant_window {
    public static void main(String[] args) {
        int[] a = { -1, 2, 3, 4, 5, -1 };
        int k = 4;
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += a[i];
        }
        int maxsum = sum;
        for (int i = 1; i < a.length - k + 1; i++) {
            sum = sum - a[i - 1] + a[i + k - 1];
            if (sum > maxsum) {
                maxsum = sum;
            }
        }
        System.out.println(maxsum);

    }
}
