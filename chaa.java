public class chaa {
    public static void main(String[] args) {
        int num = 456;
        int lastDigit = num % 10;

        num = num - lastDigit;

        System.out.println(num);
    }
}
