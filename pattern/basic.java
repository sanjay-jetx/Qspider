package pattern;
public class basic {
    public static void main(String[] args) {
        int num = 5;
        int star = 1;
        int space = num - 1;
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < space; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= star; k++) {
                System.out.print("*");
            }
            System.out.println();
            space--;
            star += 2;
        }
    }
}
