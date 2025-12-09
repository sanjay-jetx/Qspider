public class overloading {
    public void demo(double a) {
        System.out.println(a);
    }

    public static void demo(int a, int b) {
        System.out.println(a + b);
    }

    public static void demo(int a, int b, int c) {


        
        System.out.println(a + b + c);
    }

    public static void main(String[] args) {
        overloading obj1 = new overloading();
        obj1.demo(55.3f);
        obj1.demo(2, 5);
        obj1.demo(2, 3, 4);
    }
}
