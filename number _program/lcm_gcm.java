public class lcm_gcm {
    public static void main(String[] args) {
        int a = 36;
        int b = 12;
        int x = a;
        int y = b;
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        int lcm = (x * y) / a;
        System.out.println("gcd" + a);
        System.out.println("lcm" + lcm);
    }
}
