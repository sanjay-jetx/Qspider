public class basic {
    public static void method() {
        int[][] a = { { 1, 2, 3 }, { 1, 2, 3, 4 }, { 1, 2 } };
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j]);
            }
            System.out.println("");
        }

    }
    public static void main(String[]args){
        method();
    }
}
