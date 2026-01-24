public class non_zero{
    public static int productOfDigits(int n) {
        int max = 1;
        while(n>0){
            int num = n%10;
            if(num!=0){
                max = max * num;
            }
            n/=10;
        }
        return max;
    }
}