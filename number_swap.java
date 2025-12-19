public class number_swap {
    public static void method_name(int a) {
        while (a > 9) {
            int sum = 0;
            while (a > 0) {
                sum += a % 10;
                a /= 10;
            }
            a = sum;

            System.out.println(sum);
        }
    }

    public static void main(String[] args) {
        method_name(67);
    }
}
