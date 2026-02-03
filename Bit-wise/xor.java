public class xor {
    public static void main(String[] args) {
        int val = 0;
        int[] arr = { 1, 2, 3, 4, 2, 5, 6, 7, 1 };
        for (int i = 0; i < arr.length; i++) {
            val = arr[i] ^ val;
        }
        System.out.println(val);
    }
}
