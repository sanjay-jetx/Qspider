public class reverse_window {
    public static void main(String[] args) {

        int[] array = {1,2,3,4,5,6,7,8,9};
        int k = 3;

        for (int start = 0; start < array.length; start += k) {

            int lh = start;
            int rh = Math.min(start + k - 1, array.length - 1);

            while (lh < rh) {
                int temp = array[lh];
                array[lh] = array[rh];
                array[rh] = temp;
                lh++;
                rh--;
            }
        }

        // print array
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
