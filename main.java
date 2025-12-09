public class main {
    String name;
    static String college;

    public void display() {
        System.out.println(name);
        System.out.println(college);
    }

    static void clg() {
        college = "abcdef";
    }
}

class demo {
    public static void main(String[] args) {
        main demo = new main();
        demo.name = "sanjay";
        main.college = "asd";
        main.clg();
        demo.display();
    }
}