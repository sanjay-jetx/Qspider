public class lag_digit {
    public static void main(String[] args) {
        int n = 123445;
        int num = 0;
        int max = 0;
        while(n>0){
            num = n%10;
            if(max < num){
                max = num;
            }
            n/=10;
        }
        System.out.println(max);
    }
}
