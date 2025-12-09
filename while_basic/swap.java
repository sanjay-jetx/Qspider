public class swap {
    public static void main(String[] args) {
        int a = 12345;
        int count = 0;
        while (a != 0) {
            int rem = a % 10;
            count += rem;
            a = a / 10;
        }
        System.out.println(count);
    }
    }

