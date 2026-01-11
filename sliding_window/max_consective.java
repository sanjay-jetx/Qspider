

public class max_consective {
    public static void main(String[] args) {
        int [] arr={1,1,1,0,0,0,1,1,1,0};
        int maxsum = 0;
        int len = 0;
        int k = 2;
        for(int i = 0 ; i < arr.length ; i++){
            int zero = 0 ;  
            for(int  j = i ; j < arr.length ; j++){
                if(arr[j] == 0){
                    zero++;
                }
                if (zero <= k) {
                    len = j - i + 1;
                    maxsum = Math.max(maxsum, len);
                }
                else {
                    break;
                }
            }
        }
        System.out.println(maxsum);
    }
}
