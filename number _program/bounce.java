public class bounce {
    public static void main(String[] args) {
        System.out.println(method_name(101));
    }

    public static boolean method_name(int num) {
        boolean inc = false;
        boolean dec = false;

        int ld = num % 10;
        num /= 10;

        int curn = 0;
        while (num > 0) {
            curn = num % 10;
            num /= 10;

            if (curn > ld) {
                dec = true;
            } else if (ld > curn) {
                inc = true;
            }

            if (dec && inc) {
                return true;
            }
            ld = curn;
        }
        return false;

    }
}
