public class linear {
    public static void main(String[] args) {
        int nums[] = { 5, 7, 9, 11, 14 };
        int target = 11;
        int result = linearsearch(nums, target);
        if (result!= -1)
            System.out.println("element found at the index : " + result);
        else
            System.out.println("element not found");


    }

    public static int linearsearch(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (target==nums[i])
                return i;
        }
        return -1;
    }
}