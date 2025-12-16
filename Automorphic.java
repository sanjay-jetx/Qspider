public class Automorphic {

    public static void method_main(int n) {
        int square = n * n;
        int temp = n;   

        while (n != 0) {
            if (n % 10 != square % 10) {
                System.out.println("Not an Automorphic number");
                return; 
            }
            n /= 10;
            square /= 10;
        }

        System.out.println("Automorphic number");
    }

    public static void main(String[] args) {
        method_main(1234);
    }
}
