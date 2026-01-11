package pattern;

public class basic2 {
    public static void main(String[] args) {
        int star = 1;
        int space = 7;

        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= star; j++) {
                System.out.print("*");
            }
            for (int k = 1; k <= space; k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= star; j++) {
                if (!(i == 5 && j == 1)) {
                    System.out.print("*");
                }
            }
            System.out.println();

            if (i <= 4) {
                star++;
                space -= 2;
            } else {
                star--;
                space += 2;
            }

        }
    }
}
