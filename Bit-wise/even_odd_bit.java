public class even_odd_bit {
    public static void main(String[]args){
        int a= 10;
        int b = 20;

        if (((a + b) & 1) == 1) {
            System.out.println("even");
        }
        else {
             System.out.println("Odd");
        }
    }
}
