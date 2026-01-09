public class reverse {
    public static void main(String[] args) {
        reverse_number(12345);
    }

    public static void reverse_number(int num) {
        int rev = 0;
        int n;
        while (num != 0) {
            rev = rev * 10 + num % 10;
            System.out.println(rev);
            n = num /= 10;
            System.out.println(n);
            
        }
        System.out.println(rev);
        
    }
    }
