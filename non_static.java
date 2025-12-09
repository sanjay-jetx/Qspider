public class non_static {
    public void test() {
        System.out.println("hii guyss");
    }

    public static void main(String[] args) {
        non_static obj1 = new non_static();
        obj1.test();
    }
}
