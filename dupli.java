public class dupli {
    public static void main(String[] args) {
        int[] a = { 1, 1, 2, 2, 3, 4, 4 };
        for (int i = 1; i < a.length; i++) {
            if (a[i] == a[i - 1]) {
                a[i] = a[i + 1];
            }
        }
    }   
}
