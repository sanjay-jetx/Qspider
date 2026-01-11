public class swap {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        swapNumbers(a, b);
        System.out.println(a + b);
    }

    static void swapNumbers(int c, int d) {
        int temp = c;
        c = d;
        d = temp;
        System.out.println(d + c);
    }
}
