
public class basic {
    public static void L_shape(int a) {

        // Solid block
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print('*');
            }
            System.out.println();
        }
        System.out.println();

        // L shape
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++) {
                if (j == 0 || i == a - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();

        // Reverse L
        for (int i = 0; i <= a; i++) {
            for (int j = 0; j <= a; j++) {
                if (j == a || i == a) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();

        // Diagonal (/)
        for (int i = 0; i <= a; i++) {
            for (int j = 0; j <= a; j++) {
                if (j + i == a) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();

        // Diagonal (\)
        for (int i = 0; i <= a; i++) {
            for (int j = 0; j <= a; j++) {
                if (j == i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();

        // U shape
        for (int i = 0; i <= a; i++) {
            for (int j = 0; j <= a; j++) {
                if (j == a || j == 0) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();

        // Top & Bottom bar
        for (int i = 0; i <= a; i++) {
            for (int j = 0; j <= a; j++) {
                if (i == a || i == 0) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();

        // X shape
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++) {
                if (j + i == a || j == i || i == a || i == 0 || j == a || j == 0) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        L_shape(5);
    }
}
