// Outer class
public class basic_object {

    // Static variable (belongs to class)
    static String name;

    // Instance variables
    int id;
    int salary;

    public static void main(String[] args) {

        // Accessing static variable
        basic_object.name = "Sanjay";
        System.out.println(name);

        // Creating object of another class
        object2 obj2 = new object2();
        obj2.id = 1234;
        obj2.salary = 90;

        System.out.println(obj2.id + " " + obj2.salary);
    }

    // Inner class (non-static)
    class Object1 {
        int id;
        int salary;
    }
}

// Another normal class
class object2 {
    int id;
    int salary;
}
