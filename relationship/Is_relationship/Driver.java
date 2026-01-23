package relationship.Is_relationship;
class A {
    void add(int a, int b) {
        System.out.println(a + b);
    }

    A(int a, int b) {
        add(a, b);
    }
}

class B extends A {
    B() {
        super(10, 20);
        System.out.println("hiii");
    }
}
public class Driver{
    public static void main(String[] args) {
        B obj1 = new B();
    }
}



