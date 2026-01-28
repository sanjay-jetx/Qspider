package Interface;

interface Man {
    public void A();

    public static void B() {
        System.out.println("me static");
    }
}

public class husdand implements Man {

    @Override
    public void A() {
        System.out.println("hii");
    }

    public static void main(String[] args) {
        Man obj1 = new husdand();
        obj1.A();
        Man.B();
    }
    
    
}
