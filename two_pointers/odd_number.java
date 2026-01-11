

public class odd_number {
    public static void main(String[] args) {
        int[] a = { 1, 2, 1, 1, 3, 2, 1 };
        int key = 2;
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            count = 0;
            for (int j = i; j < a.length; j++) {
                if (a[j]%2 != 0) {
                    if (key >= count) {
                        count++;
                    }
                }
            }
        }
        System.out.println(count);
    }
}
