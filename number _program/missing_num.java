import java.util.HashMap;

public class missing_num {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 5, 4 };

        HashMap<Integer, Integer> map = new HashMap<>(arr.length + 1);
        
        for (int i : arr) {
            map.put(i, i);
        }
        for (int i = 1; i < arr.length; i++) {
            if (!map.containsKey(i)) {
                System.out.println("Missing number is: " + i);
                break;
            }
        }
    }
}


