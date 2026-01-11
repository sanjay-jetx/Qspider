class Mobile {
    String brand;
    int price;
    static String name;

    public void show() {
        System.out.println(brand + " ; " + price + " ; " + name);
    }

    public static void show1(Mobile obj1) {
        System.out.println(obj1.brand + " ; " + obj1.price + " ; " + name);
    }
}

public class StaticExample {
    public static void main(String[] args) {

        Mobile obj1 = new Mobile();
        obj1.brand = "Apple";
        obj1.price = 1500;
        Mobile.name = "Smartphone";

        Mobile obj2 = new Mobile();
        obj2.brand = "Samsung";
        obj2.price = 1700;
        Mobile.name = "Smartphone";

        Mobile.name = "Phone";
        // show the output
        obj1.show();
        obj2.show();

        Mobile.show1(obj1);
    }
}
