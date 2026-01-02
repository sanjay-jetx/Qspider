public class basic {
    static String name;
    int id;
    int salary;

    public static void main(String[] args) {
        basic obj1 = new basic();
        name = "Sanjay";
        obj1.id = 23;
        obj1.salary = 12000;
        System.out.println(name);
///////// imp points heree
        basic outer = new basic();
        basic.Object1 obj = outer.new Object1();
        obj.id = 12;
        obj.salary = 1222;
        System.out.println(obj.id + obj.salary);
///////////////////////////////////////////////////////
        object2 obj2 = new object2();
        obj2.id = 1234;
        obj2.salary = 90;

    }
//////////inside in the inner class
    class Object1 {
        int id;
        int salary;
    }
}

class object2 {
    int id;
    int salary;
}
