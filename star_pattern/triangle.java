
public class triangle {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print('*');
            }
            System.out.println("");
        }

        System.out.println("");
        System.out.println("");
        System.out.println("");

        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("");
        System.out.println("");
        System.out.println("");

        int space = 4;
        int star = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < space; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < star; j++) {
                System.out.print('*');
            }
        }
        System.out.println();
        space--;
        star++;

    }
}
