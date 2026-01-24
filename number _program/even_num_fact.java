public class even_num_fact{
    
    public static int sumOfEvenFactors(int num) {
        int sum = 0;
        for(int i = 1; i  <= num ; i++){
            if(i%2==0 && num%i==0){
                sum+=i;
            }
        }
        return sum;
}
}