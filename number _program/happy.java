public class happy {
    public static int sqsum(int num) {
        int sum = 0;
        while (num != 0) {
            int ld = num % 10;
            sum += ld * ld;
            num /= 10;

        }
        return sum;
    }

    public static boolean ishappy(int num) {
        while (num != 1 && num != 4) {
            num = sqsum(num);

        }
        return num == 1;
    }

    public static void main(String[] args) {
        sqsum(34);
    }
}