public class palindrom {
    public static void main(String[] args) {
        int num = 1231;
        int rev = 0;
        int temp = num;
        while (num > 0) {
            rev = rev * 10 + num%10 ;
            num /= 10;
        }
        num = temp;
        if (num == rev) {
            System.out.println("it is palindrom");
        }
    }   
}
