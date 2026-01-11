

public class sorting {
    public static void main(String[] args) {
        int[] a = { 1, 0, 0, 1, 1, 0, 0, 1, 0, 0, 0 };
        //0,0,0,1,0,0,1,1,0,0,1
        int lh = 0;
        int rh = a.length - 1;
        int temp = 0;
        while (lh < rh) {
            if (a[lh] > a[rh]) {
                temp = a[lh];
                a[lh] = a[rh];
                a[rh] = temp;
                lh++;
                rh--;
            } else if (a[lh] == 0) {
                lh++;
            } else if (1 == a[rh]) {
                rh--;
            }
        }
        for (int i = 0; i <= a.length - 1; i++) {
            System.out.println(a[i]);
        }
    }

}