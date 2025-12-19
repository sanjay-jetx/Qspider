public class prime_number {
    public static void main(String[] args) {
        int num = 1, num1 = 10;
        prime_number_find(num, num1);
    }

    public static void prime_number_find(int num, int num1) {
        char is_prime = 't';
        for (int j = 0; j <= num1; j++) {
            if (num <= 1) {
                System.out.println(num + "it is not prime");
            }
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    is_prime = 'f';
                    break;
                }
            }
            if (is_prime == 'f') {
                System.out.println(num + "it is not prime number ");
            } else {
                System.out.println(num + "it is  prime number ");
            }

        }
    }
}
