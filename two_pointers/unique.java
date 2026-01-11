

public class unique {
public static void main(String[] args) {
	int [] arr1= {1,2,2,3,1,4};
	int n=arr1.length;
	for(int i=0;i<n;i++) {
		int digit = 0;
		for(int j=0;j<n;j++) {
			if(arr1[i]==arr1[j]) {
				digit++;
			}
		}
		if(digit==1) {
			System.out.println(arr1[i]);
		}
	}
}
}

