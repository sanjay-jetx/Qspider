public class second_largest {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 7, 7, 5 };
        int max =0;
        int  max_2=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max_2 = max;
                max = arr[i];
            }
            else if (arr[i] > max_2 && max > arr[i]) {
                max_2 = arr[i];
            }
        }
        System.out.println(max_2 + " " + max);
    }
}
 