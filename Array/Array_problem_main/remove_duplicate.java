package Array_problem_main;
import java.util.*;
public class remove_duplicate {
    public static void main(String[] args) {
        int arr[] = { 1, 1, 2, 2, 3, 3 };
        while_method(arr);
        hash_method(arr);
        set_method(arr);
    }
////////////////////////////////////////////////////////////
    static void set_method(int arr[]) {
        HashSet<Integer> map = new HashSet<>();
        for (int i : arr) {
            map.add(i);
        
        }
        for (int val : map) {
            System.out.println(val);
        }
    }
///////////////////////////////////////////////////////////////
    static void hash_method(int arr[]) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int count = 0;
        for (int i : arr) {
            if (!map.containsValue(i)) {
                map.put(count++,i);
            }
        }
        for (int key : map.values()) {
            System.out.println(key);
        }
        System.out.print(map);
    }
//////////////////////////////////////////////////////////////////////
    static void while_method(int arr[]) {
        int lh = 0;
        int rh = lh + 1;
        while (rh < arr.length) {
            if (arr[lh] != arr[rh]) {
                arr[++lh] = arr[rh];

            }
            rh++;
        }
        System.out.println(Arrays.toString(arr) + " hlo " + (lh + 1));
    }
}
    

