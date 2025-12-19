package two_pointers;

public class even {
    public static void main(String[] args) {
        int[] a = { 1,4,5,3,5,6,12,1};
        int lh = 0;
        int temp = 0;
        int rh = a.length - 1;
        while(lh < rh) {
            if(a[lh] % 2 == 0) {
                temp = a[rh];
                a[rh] = a[lh];
                a[lh] = temp;
                rh--;
            }
            else {
                lh++;
            }
        }
         for (int i = 0; i <= a.length - 1; i++) {
            System.out.println(a[i]);
        }
    }
}
