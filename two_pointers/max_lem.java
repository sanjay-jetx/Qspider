

public class max_lem {
    public static void main(String[] args) {
        int[] a = { 2, 5, 1, 7, 10 };
        int k = 14;
        int maxsum = 0;
        int lh = 0;
        int rh = 0;
        int sum = 0;

        while (rh < a.length) {
            sum = sum + a[rh];

            while (sum > k) {
                sum = sum - a[lh];
                lh++;
            }

            if (sum > maxsum) {
                maxsum = sum;
            }

            rh++;
        }
        System.out.println(maxsum);
    }
}
