public class as {
    public static int subarray(int []arr,int k) {
	int sum=0;
	int max=Integer.MIN_VALUE;
	for(int i=0;i<=k-1;i++) {
		sum+=arr[i];
	}
	max=sum;
	for(int i=k;i<arr.length;i++) {
		sum=sum-arr[i-k];
		sum=sum+arr[i];
		if(sum>max) 
			max=sum;
	}
    return max;
	}
}
sss