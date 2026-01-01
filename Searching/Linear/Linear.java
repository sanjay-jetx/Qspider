package Searching.Linear;

public class Linear {
    public static void basic(int a[], int target) {
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == target) {
                System.out.println(count);
                System.out.println("index of the target element : " + i);
                break;
            }
        }
        for (int i = a.length - 1; i >= 0; i--) {
            if (a[i] == target) {
                System.out.println("index of the target element : " + i);
                break;
            }
        }
    }
    public static void first_last(int a[] ,int target){
            int first = -1;
            int last = 0;
            for(int i = 0 ; i < a.length ; i++){
                if(a[i] == target){
                    if(first == -1){
                        first = i;
                    }
                    last = i;
                }

            }
            System.out.println(first +" "+ last);
        }

    public static void main(String[] args) {
        int a[] = { 1, 2, 3, 4, 5, 6, 4 };
        int target = 4;
        basic(a, target);
        first_last(a, target);
    }
}
