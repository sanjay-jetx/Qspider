public class Strong {

    public static void method_name(int a) {
        int temp = a;
        int add = 0;

        while (a > 0) {
            int num = a % 10;
            int fact = 1;

            for (int i = 1; i <= num; i++) {
                fact *= i;
            }

            add += fact;
            a /= 10;
        }

        if (temp == add) {
            System.out.println("Strong number");
        } else {
            System.out.println("Not a Strong number");
        }
    }

    public static void main(String[] args) {
        method_name(145);
    }
}
