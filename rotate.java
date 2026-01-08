class Solution {
    public boolean isSmith(int n) {
        if (isPrime(n)) return false; 

        int sumDigits = digitSum(n);
        int sumFactors = primeFactorDigitSum(n);

        return sumDigits == sumFactors;
    }
    private int digitSum(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
    private int primeFactorDigitSum(int n) {
        int sum = 0;
        for (int i = 2; i <= n; i++) {
            while (n % i == 0 && isPrime(i)) {
                sum += digitSum(i);
                n /= i;
            }
        }
        return sum;
    }

    // Check if a number is prime
    private boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}