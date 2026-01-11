public class basic_array_main {
    public static void main(String[] args) {
        int[] arr_main = new int[4];
        arr_main[0] = 10;
        arr_main[1] = 20;
        arr_main[2] = 30;
        int add = 0;
        for (int i = 0; i < arr_main.length; i++) {
            System.out.println(arr_main[i]);
            add = add + arr_main[i];
        }
        System.out.println(add);

    }
}
