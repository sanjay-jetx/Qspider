public class largest_number{
    public static int largestDigit(int n) {
        int num = 0;
        int max = 0;
        while(n>0){
            num = n%10;
            if(max < num){
                max = num;
            }
            n/=10;
        }
        return max;
    }
}