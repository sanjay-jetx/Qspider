//minimum of rows
public class minelementinarray {
	public static void minofrow(int[][]a){

	for(int i=0;i<a.length;i++) {
		int min=Integer.MAX_VALUE;
		for(int j=0;j<a[i].length;j++) {
			if(min>a[i][j]) {
				min=a[i][j];
			}
		}
		System.out.println("Minimum of row " + (i + 1) + ": " + min);
	}
		
	
	}
public static void main(String[]args) {
	int [][]a= {
			{1,2,3},{4,5,6},{7,8,9}
	};
	
	minofrow(a);
	
}
}