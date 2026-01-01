class basic {
    public int[] searchRange(int[] nums, int target) {
        if(nums==null||nums.length==0)
        return new int[]{-1,-1};
        int first=firstocc(nums,target);
        int second=secondocc(nums,target);
        return new int[]{first,second};
    }
    public int firstocc(int[]a,int target){
      int left=0;
      int right=a.length-1;
      int index=-1;
      while(left<=right){
        int mid=(left+right) /2;
        if(a[mid]==target){
            index = mid;
            right=mid-1;
        }
        else if(a[mid]<target){
            left=mid+1;
        }
        else{
             right=mid-1;
        }
      }
      return index;
    }
    public int secondocc(int[]a,int target){
      int left=0;
      int right=a.length-1;
      int index=-1;
       while(left<=right){
        int mid=(left+right) /2;
        if(a[mid]==target){
            index= mid;
            left=mid+1;
        }
        else if(a[mid]<target){
            left=mid+1;
        }
        else{
            right=mid-1;
        }
      }
      return index;
    }
    }