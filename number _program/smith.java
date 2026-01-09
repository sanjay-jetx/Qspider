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

        for (int i = 2; i * i <= n; i++) {
            while (n % i == 0) {
                sumFactors += digitSum(i);
                n /= i;
            }
        }

        if (n == temp)
            return false;
        
        if (n > 1)
            sumFactors += digitSum(n);

        return sumDigits == sumFactors;
    }
}