package Random;
public class arrrrr {
	public static int[] reverseWindow(int a[], int k) {
        int n = a.length;
        for(int i = 0 ; i< n ; i+=k){
            int lh = i;
            int rh = Math.min(i+k-1, n-1);
            while(lh < rh){
                int temp = a[lh];
                a[lh] = a[rh];
                a[rh] = temp;
                lh++;
                rh--;
            }
        }
        return a;
	}

	public static void main(String[] args) {

		int a[] = {1,2,3,4,5,6,7,8,9};
		int k = 3;

		System.out.println(Arrays.toString(reverseWindow(a, k)));
	}

}


3.
public class SubArrayProductLessThanLimit {

    public static int countSubArr(int a[], int limit) {

        int i = 0;
        int prod = 1;
        int count = 0;

        for(int j = 0; j < a.length; j++) {

            prod = prod * a[j];

            while(prod >= limit && i <= j) {
                prod = prod / a[i];
                i++;
            }

            count = count + (j - i + 1);
        }

        return count;
    }

    public static void main(String[] args) {

        int a[] = {10, 5, 2, 6};
        int limit = 100;

        System.out.println("Count = " + countSubArr(a, limit));
    }
}

