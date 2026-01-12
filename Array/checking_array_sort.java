public class checking_array_sort {
    public static void main(String[] args) {
        int [] arr = { 1, 2, 3, 4, 5, 6 };
        // int lh = 0;
        boolean isSorted = true;
        // int rh = arr.length - 1;
        // while (lh < rh) {
        //     if (arr[lh] <= arr[rh]) {
        //         lh++;
        //         rh--;

        //     } else {
        //         isSorted = false;
        //         break;
        //     }
        // }
        
        // System.out.println(isSorted);
        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1] > arr[i]) {
                isSorted = false;
                break;

            }
        }
        System.out.println(isSorted);
    }
}
