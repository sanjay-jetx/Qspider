class Solution {

    static int digitSum(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }

    static boolean isSmith(int n) {
        int temp = n;
        int sumDigits = digitSum(n);
        int sumFactors = 0;

        // Check prime factors
        for (int i = 2; i * i <= n; i++) {
            while (n % i == 0) {
                sumFactors += digitSum(i);
                n /= i;
            }
        }

        // If n is prime, it's NOT a Smith number
        if (n == temp)
            return false;

        // Remaining prime factor
        if (n > 1)
            sumFactors += digitSum(n);

        return sumDigits == sumFactors;
    }
}