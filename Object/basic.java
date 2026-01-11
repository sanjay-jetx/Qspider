// Outer class

// import Random.basic;

public class basic {

    // Static variable (belongs to class, shared by all objects)
    static String name;

    // Instance variables (belong to each object)
    int id;
    int salary;

    public static void main(String[] args) {

        // Creating object of outer class 'basic'
        // basic_2Darray obj1 = new basic_2Darray();
        // obj1.id = 23;
        // obj1.salary = 12000;

        // Accessing static variable using class (or object – but class is preferred)
        basic.name = "Sanjay";

        // Printing static variable
        System.out.println(name);

        // ================= IMPORTANT PART =================

        // Creating another outer class object
        // This object will be used to create inner class object
        // basic_2Darray outer = new basic_2Darray();

        // Creating object of NON-STATIC inner class
        // Syntax: outerObject.new InnerClass()
        // basic_2Darray.Object1 obj = outer.new Object1();

        // Setting inner class variables
        // obj.id = 12;
        // obj.salary = 1222;

        // Printing inner class data
        // System.out.println(obj.id + obj.salary);

        // ==================================================

        // Creating object of another (separate) class
        object2 obj2 = new object2();

        // Setting values
        obj2.id = 1234;
        obj2.salary = 90;
    }

    // -------- Inner class (non-static) --------
    // It depends on outer class object
    class Object1 {
        int id;
        int salary;
    }
}

// -------- Another normal class --------
// Not public, so allowed in same file
class object2 {
    int id;
    int salary;
}

// Code done by me but command done by Chatgpt !!!