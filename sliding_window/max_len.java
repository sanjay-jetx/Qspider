package sliding_window;

public class max_len {
    public static void main(String[] args) {
        int[] a = { 2, 5, 1, 7, 10 };
        int k = 14;
        int maxsum = 0;
        for (int i = 0; i < a.length; i++) {
            int sum = 0;
            for (int j = i; j < a.length; j++) {
                sum += a[j];
                if (k >= sum) {
                    if (sum > maxsum) {
                        maxsum = sum;
                        
                        for (int q = i; q <= j; q++) {
                            System.out.print(a[i]);
                        }
                        System.out.println();
                    }
                }
            }
        }
        System.out.println(maxsum);
    }
}
