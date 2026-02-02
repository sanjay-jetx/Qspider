public class fibo2 {
    public static int findFibonacci(int n) {
        if(n == 0){return 0;}
        int a = 0 ;
        int b = 1;
        int c = 0;
        for(int i = 1 ; i < n ; i++){
            c = a+b;
            a = b;
            b = c;
        }
        return b;
    }
}
