
public class peak {
    public static void main(String[] args) {
        int[] arr = { 2, 3, 4, 9, 14, 16, 18 };
        int target = 15;
        System.out.println(basic(arr, target));
    }

    static int basic(int[] a, int target) {
        int lh = 0;
        int rh = a.length - 1;
        while (lh <= rh) {
            int mid = (lh + rh) / 2;
            if (a[mid] == target) {
                return mid;
            } else if (a[mid] < target) {
                lh = mid + 1;
            } else {
                rh = mid - 1;
            }
        }
        return lh;
        // return rh;
    }
}
