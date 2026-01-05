public class PenDriver {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pen p1=new Pen("win","blue",7);
		Pen p2=new Pen("natraj","black",5);
		Pen p3=new Pen("xo","red",10);
		System.out.println("Brand=  "+p1.a+", Colour= "+p1.b+" , Price ="+p1.c);
		System.out.println("Brand= "+p2.a+", Colour=  "+p2.b+ ", Price= "+p2.c);
		System.out.println("Brand= "+p3.a+", Colour= "+p3.b+" , Price ="+p3.c);
	}

}

class Pen {
	String a;
	String b;
	int c;
	Pen(String a, String b, int c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
}