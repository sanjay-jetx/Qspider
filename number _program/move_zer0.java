public class move_zer0 {
    public static void zero() {
        int[] a = { 1, 20, 9, 0, 8, 0, 2, 1 };
        int lh = 0;
        int rh = a.length - 1;
        while (lh < rh) {
            if (a[lh] == 0) {
                int temp = a[lh];
                a[lh] = a[rh];
                a[rh] = temp;
                rh--;
            } else {
                lh++;
            }
        }
    }
}

public static void main(String[] args) {
    zero();
    frequent();
    kapreker();
    consectuvie();
    disarium();
    sumofarray();
    count_eqaul();
    even();
    sum();
    duplicate();
    dpil();
}

public static void dpil() {
    int[] arr = { 1, 1, 2, 2, 3, 4, 4 };
    int lh = 0;
    int rh = arr.length - 1;
    while (lh < rh) {
        if (arr[lh] % 2 == 0) {
            int temp = arr[lh];
            arr[lh] = arr[rh];
            arr[rh] = temp;
            rh--;
        }
        else {
            lh++;
        }
    }
}





public static void duplicate() {
    int[] arr = {1, 1, 2, 2, 3, 4, 4};
    int j = 0;
    for (int i = 1; i < arr.length; i++) {
        if (arr[j] != arr[i]) {
            j++;
        }
        arr[j] = arr[i];
    }
}

public static void sum() {
    int[] arr = { 1, 2, 3, 4, 5 };
    int k = 7;
    int lh = 0;
    int count = 0;
    int rh = arr.length-1;
    while(lh < rh) {
        int sum = arr[lh] + arr[rh];
        if (sum == k) {
            count++;
            lh++;
            rh--;
        }
        else if (sum < k) {
            lh++;
        }
        else {
            rh--;
        }
    }
    
    }

public static void even() {
    int[] a = { 2, 5, 4, 3, 6, 8, 1 };
    int k = 3;
    int n = a.length;
    int count = 0;
    int index = 0;
    int st = 0;
    int[] nega = new int[10];
    for (int i = 0; i < k; i++) {
        if (a[i] < 0) {
            nega[index++] = a[i];
        }
    }
    for (int i = 1; i < n - k + 1; i++) {
        if (a[i - 1] < 0) {
            st++;
        }
        if (a[i + k - 1] < 0) {
            nega[index] = a[i+k-1];
            index++;
        }
    }
}









public static void count_equal() {
    int[] a = { 1, 2, 3, 4, 2, 3, 1 };
    int k = 3;
    int x = 6;
    int n = a.length;
    int count = 0;
    int sum = 0;
    int max = 0;
    for (int i = 0; i < k; i++) {
        sum += a[i];
    }
    if (sum == x) {
        count++;
    }
    for (int i = 1; i < n - k + 1; i++) {
        sum = sum - a[i - 1] + a[i + k - 1];
        if (sum == x) {
            count++;
        }
    }
}




public static void sumofarray() {
    int a[] = { 1, 2, 3, 4, 5, 6, 7, 8 };
    int k = 3;
    int sum = 0;
    int n = a.length;
    int max = 0;
    for (int i = 0; i < k; i++) {
        sum += a[i];
    }
    max = sum;
    for (int i = 1; i < n - k + 1; i++) {
        sum = sum - a[i - 1] + a[i + k - 1];
        if (sum < max) {
            max = sum;
        }
    }

  }
    

 
    public static void disarium() {
        int a = 175;
        int temp = a;
        int count = 0;
        while (temp > 0) {
            count++;
            temp /= 10;
        }
        temp = a;
        int sum = 0;
        while (temp > 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, count);
            count--;
            temp /= 10;
        }
        if (sum == a) {
            
        }

    }

    public static void consectuvie() {
        int a[] = { 1, 1, 0, 1, 1, 1 };
        int max = 1;
        int count = 1;
        for (int i = 1; i < a.length; i++) {
            if(a[i] == a[i-1]){
                count++;
            } 
            else{
                count = 1;
            }
            if(max<count)

            {
                max = count;
            }
        }
    

    public static void kapreker() {
        int a = 45;
        int sqr = a * a;
        int temp = sqr;
        int count = 0;
        while (sqr > 0) {
            count++;
            sqr /= 10;
        }
        sqr = temp;
        int pow = count;
        int math_pow = (int) Math.pow(10, pow);
        int first = sqr / math_pow;
        int second = sqr % math_pow;
        int result = first + second;
        if (a == result) {
            System.out.println("true");
        }
    }

    public static void frequent() {
        int maxcount = 0;
        int a[] = { 1, 2, 3, 2, 4, 2, 5 };
        int count = 0;
        int val = 0;
        for (int i = 0; i < a.length; i++) {
            count = 0;
            for (int j = 0; j < a.length; j++) {
                if (a[i] == a[j]) {
                    count++;
                    if (maxcount < count) {
                        maxcount = count;
                        val = a[i];
                    }
                }
            }
        }
    }
}
