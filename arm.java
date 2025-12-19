public class arm {
    public static void main(String[] args) {
        int number = 153;
        int num = 0;
        int count = 0;
        int min = 0;
        int temp = number;
        int max = 0;
        while (number > 0) {
            min = number % 10;
            number /= 10;
            count++;
        }
        System.out.println(count);
        number = temp;
        while (number > 0) {
            num = number % 10;
            number /= 10;
            max = max + (int) Math.pow(num, count);

        }
        System.out.println(max);

        if (max == temp)

        {
            System.out.println("it is armstrong");
        }
    }
}

