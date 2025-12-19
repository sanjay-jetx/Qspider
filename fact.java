public class fact {
    public static void main(String[] args) {
        int fact = 1;
        int a = 5;
        for (int i = 1; i <= a; i++) {
            fact *= i;
        }
        System.out.println(fact);
    }
    
}
