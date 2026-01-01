public class sumofrows {
public static void main(String[]args) {
	int [][]a= {
			{1,2,3},{4,5,6}
	};
	for(int i=0;i<a.length;i++) {
		int sum=0;
		for(int j=0;j<a[i].length;j++) {
			sum=sum+a[i][j];
		}
		int k=i+1;
		System.out.println("sum of rows no "+k+":"+sum);
	}
}
}