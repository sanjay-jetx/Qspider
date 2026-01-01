public class sumofmatrix {
public static int sum(int[][]a) {
	int sum=0;
	for(int i=0;i<a.length;i++) {
		for(int value: a[i]) {
			sum=sum+value;
		}
	}
	
	return sum;
}
public static void main(String[]args) {
	int [][]a= {
			{1,2,3},{4,5,6}
	};
	
	System.out.println("sum of 2d array: "+sum(a));
}
}