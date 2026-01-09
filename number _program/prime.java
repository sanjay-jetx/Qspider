public class prime {
    static void prime_method(int num , int num1) {
        for (int j = num; num1 >= j; j++) {

            if (j <= 1) {
                System.out.println(j + " is not prime number");
                continue;
            }

            if (j == 2) {
                System.out.println(j + " is prime number");
                continue;
            }

            boolean flag = true;  

            for (int i = 2; i <= j / 2; i++) {
                if (j % i == 0) {
                    flag = false;
                    break;
                }
            }

            if (flag)
                System.out.println(j + " is prime number");
            else
                System.out.println(j + " is not prime number");
        }
    }

    public static void main(String[] args) {
        prime_method(10, 100);
    }
}
