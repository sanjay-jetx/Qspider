public class happy {
    public static int sqsum(int num) {
         int sum = 0;
        while (num != 0) {
            int ld = num % 10;
            sum += ld * ld;
            num /= 10;
            num = sum;
        }
    public static boolean ishappy(int num){
        while(num!=1 && num!=4){
            num=sqsum(num);

        }
        
    }

    public static void main(String[] args) {
        sqsum(34);
    }
}
}