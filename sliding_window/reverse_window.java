package sliding_window;

public class reverse_window {
    public static void main(String[]args){
        int [] array = {1,2,3,4,5,6,7,8,9};
        int k = 3;
        int index = 0;
        int lh = 0;
        int rh = k - 1;
        while (lh < rh) {
            int temp = array[rh];
            array[rh] = array[lh];
            array[lh] = temp;
            lh++;
            rh--;
            index++;
        }
        while()
        for (int i = 0; i < array.length - 1; i++) {
            System.out.println(array[i]);
        }
    }
}
