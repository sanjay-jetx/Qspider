public class basic1 {
    public static void main(String[] args) {
        employee obj1 = new employee();
        employee obj2 = new employee();
        employee obj3 = new employee();
        employee obj4 = new employee();
        employee obj5 = new employee();

        obj1.name = "Sanjay";
        obj1.id = 101;
        obj1.salary = 12000;

        obj2.name = "tharun";
        obj2.id = 102;
        obj2.salary = 12000;

        obj3.name = "pranesh";
        obj3.id = 100;
        obj3.salary = 100000000;

        obj4.name="sam";
        obj4.id = 103;
        obj4.salary = 12000;


        System.out.println(obj1.name + " " + obj1.id + " " + obj1.salary);
        System.out.println(obj2.name + " " + obj2.id + " " + obj2.salary);
        System.out.println(obj3.name + " " + obj3.id + " " + obj3.salary);
        System.out.println(obj4.name + " " + obj4.id + " " + obj4.salary);

    }
}

class employee {
    String name;
    int id;
    int salary;
}
