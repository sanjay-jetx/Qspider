class Buddle {
    public static void main(String [] args){
    int nums[] = { 9, 4, 62, 6, 16, 3, 8 };
    int size = nums.length;
    int temp = 1 ;
    
    System.out.println("before sort");

    for( int num :  nums )
    {
        System.out.println(num + " ");
    }
    for(int i = 0;i<size;i++)
    {
        for (int j = 0; j < size - 1; j++) {
            if (nums[j] > nums[j + 1]) {
                temp = nums[j];
                nums[j] = nums[j + 1];
                nums[j + 1] = temp;
                for (int num : nums) {
                    System.out.print(num + " ");
                }
                System.out.println(" ");
            }
        }
    }
    System.out.println("after sort");

    for( int num :  nums )
    {
        System.out.print(num + " ");
    }
}

}
