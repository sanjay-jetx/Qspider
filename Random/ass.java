package Random;
import java.util.Scanner;
public class ass {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Gender");
		String gender=sc.next();
		System.out.println("expirience");
		int exp=sc.nextInt();
		System.out.println("Qualification");
		String qlf=sc.next();
		if(gender.equals("male") && exp>=10 && qlf.equals("PG")) {
			System.out.println("salary is 15000");
			}
		else if(gender.equals("male") && exp>=10 && qlf.equals("UG")) {
			System.out.println("salary is 10000");
	}
		else if(gender.equals("male") && exp<10 && qlf.equals("PG")) {
			System.out.println("salary is 10000");
}
		else if(gender.equals("male") && exp<10 && qlf.equals("UG")) {
			System.out.println("salary is 7000");
}
		else if(gender.equals("female") && exp>=10 && qlf.equals("PG")) {
			System.out.println("salary is 12000");
			
}
		else if(gender.equals("female") && exp>=10 && qlf.equals("UG")) {
			System.out.println("salary is 9000");
	}
		else if(gender.equals("female") && exp<10 && qlf.equals("PG")) {
			System.out.println("salary is 8000");
}
		else if(gender.equals("female") && exp<10 && qlf.equals("UG")) {
			System.out.println("salary is 6000");
	}
}
}
