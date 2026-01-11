public class demooo {
    // private int id ;
    // private String name;
    // private int salary;

    public void method_n(int id, String name, int salary) {
        // this.id = id;
        // this.name = name;
        // this.salary = salary;
        System.out.println(id + " " + name + " " + salary);
    }

    public static void main(String[] args) {
        demooo obj1 = new demooo();
        demooo obj2 = new demooo();
        // demooo obj3 = new demooo();
        obj1.method_n(1, "sa", 12);
        obj2.method_n(2, "qw", 133);

    }
}
