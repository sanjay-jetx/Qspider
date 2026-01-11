
public class reverse_trinagle {
    public static void main(String[] args) {
        int n = 5;
        for (int i = n; i < n; i--) {
            for (int j = 0; i >= j; j++) {
                System.out.println("*");
            }
            System.out.println(" ");
        }
    }
}
