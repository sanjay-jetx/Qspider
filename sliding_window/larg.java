

public class larg {
    public static void main(String[] args) {
        int[] a = { 2, 1, 5, 2, 3, 2 };
        int sum = 0;
        int max_length = 0;
        int k = 7;
        int len = 0;
        int right = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
            while (sum >= k) {
            len = right - i + 1;
            if (len > max_length) {
                max_length = len;
            }
                sum -= a[right];
                right++;
            }
            len = i-right + 1;
            if (len > max_length) {
                max_length = len;
            }
        }
        System.out.println(max_length);
    }
    }