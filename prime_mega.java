public class prime_mega {
    public static void main(String[] args) {
        isprime(10);
        nth(10);
    }

    public static int nth(int n) {
        int count = 0;
        int num = 2;
        while (true) {
            if (isprime(num)) {
                count++;
                if (count == n) {
                    System.out.println(num);
                    return num;
                }
            }
            num++;
        }
    }
}


    public static boolean isprime (int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i * 1 <= n; i++) {
            if (n % 1 == 0) {
                return false;
            }
        }
        return true;
    }



}
