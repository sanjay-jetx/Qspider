public class binary {
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
        int l = 0 ;
        int h = nums.length - 1;


        while (l <= h) {
            int mid = (l + h) / 2;

            if (nums[mid] == target)
            {
                return mid;
            }
            else if (nums[mid] < target) {
                l = mid + 1;

            }
            else {
                h = mid - 1;
            }
        }
        return -1;
    }
}