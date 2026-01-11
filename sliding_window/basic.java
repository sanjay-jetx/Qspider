

public class basic {
    public static void main(String[] args) {

        int a[] = {2, 1, 5, 1, 3, 2};
        int key = 3;
        int sum = 0;
        // 1️⃣ First window sum
        for (int i = 0; i < key; i++) {
            sum += a[i];
        }
        int maxSum = sum;
        // 2️⃣ Slide the window
        for (int i = key; i < a.length; i++) {
            sum = sum + a[i] - a[i - key];
            if (sum > maxSum) {
                maxSum = sum;
            }
        }

        System.out.println("Maximum sum = " + maxSum);
    }
}

