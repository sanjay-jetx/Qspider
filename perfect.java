public class perfect {
    public static void main(String[] args) {
        int num = 28;
        for (int i = 1; num / 2 >= i; i++) {
            if (num % i == 0) {
                System.out.print( " " + i);
            }
        }
    }
}
