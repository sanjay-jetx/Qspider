package sliding_window;

public class avg {
    public static void main(String[] args) {
        int[] arr = { 2, 1, 5, 1, 3 };
        int n = arr.length;
        int k = 3;
        int x = 3;
        int count = 0;
        int windowsum = 0;
// default window------------------------
        for (int i = 0; i < k; i++) {
            windowsum += arr[i];
        }
// avg------------------------------------
        int avg = windowsum / k;
        if (avg >= x) {
            count++;
        }
        //sliding window--------------------------
        for (int i = 1; i < n - k + 1; i++) {
            windowsum = windowsum - arr[i - 1] + arr[i + k - 1];
            avg = windowsum / k;
            if (avg >= x) {
            count++;
        }
        }
    }
}
