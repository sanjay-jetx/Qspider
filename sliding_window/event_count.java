package sliding_window;

public class event_count {
    public static void main(String[]args){
        int k = 3;
        int[] a = { 2, 3, 4, 6 , 8, 8, 1 };
        int len = a.length;
        int count = 0;
        int mcount = 0;
        for (int i = 0; i < 3; i++) {
            if (a[i] % 2 == 0) {
                count++;
            }
        }
        int maxcount = count;
        for (int i = 1; i < len-k+1; i++) {
            //if (a[i] % 2 == 0) {
              //  count++;
            //}
            if (a[i - 1] % 2 == 0) {
                count--;
            }
            if (a[i + k - 1] % 2 == 0) {
                count++;
            }
            if (count > maxcount) {
                maxcount = count;
            }
        }
        System.out.println(maxcount);
    }
}
