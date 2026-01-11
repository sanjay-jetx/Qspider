public class swap_last2 {
	public static void main(String[] args) {
		reverse(123468);

	}

	public static void reverse(int num) {
		// int n = 0;
		int temp = num;
		int count = 0;
		while (num > 0) {
			int n = num % 10;

			num /= 10;
			count++;
		}
		int pow = 1;
		for (int i = 1; i <= count / 2; i++) {
			pow *= 10;
		}
		System.out.println(pow);

		num = temp;
		int rev = 0;
		int store = 0;
		System.out.println("total-numbers : " + count);
		int first_half = num / pow;
		int second_half = num % pow;
		System.out.println("first half : " + first_half);
		System.out.println("second: " + second_half);
		while (second_half > 0) {
			store = second_half % 10;
			rev = rev * 10 + store;
			second_half /= 10;

		}
		System.out.println(rev);
		System.out.println(first_half * pow + rev);
	}

}
