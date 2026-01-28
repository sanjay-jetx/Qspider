abstract class basic {
    abstract public void demo(int a);
}

public class demo extends basic {

    public void demo(int a) {
        System.out.println("hiiii");
    }

    public static void main(String[] args) {
        basic obj1 = new demo();
        obj1.demo(10);
    }

}
