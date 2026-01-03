public class constructor {
    public static void main(String[] args) {
        methos_name obj1 = new methos_name(12,"sanjay",12000);

    }
}

class methos_name {
    int id;
    String name;
    int salary;

    methos_name(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        System.out.println(id + " " + name + " " +salary);
    }
}
