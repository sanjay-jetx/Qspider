class adjacent_Factors{
    public static void main(String[] args) {
        int num = 666;
        functon(num);
    }

    public static void functon(int n) {
        int count = 0;
        int pre = -1;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                if (pre != -1) {
                    int sum = pre + i;
                    if (!isprime(sum)) {
                        count++;
                    }
                }
                pre = i;
            }

        }
    }

    public static boolean isprime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i < n; i++) {
        if (n % i == 0)
            return false;
    }
    return true;
    }
}