package two_pointers;

public class remove_zero {
    public static void main(String[] args) {
        int[] a = { 1, 0, 3, 0, 5, 0, 7 }; 
        int rh = 0 ;
        int dummy = a.length-1;
        while (rh <= dummy) {
            if (a[rh] == 0) {
                int temp = a[rh];
                a[rh] = a[dummy];
                a[dummy] = temp;
                dummy--;
            }
            else {
                rh++;
            }
        }
        for (int i = 0; i <= a.length - 1; i++) {
            System.out.println(a[i]);
        }
    }
}
