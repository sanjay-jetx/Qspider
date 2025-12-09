class Demo {
    String brand;
    int price;
    String name;

    public void show() {
        System.out.println(brand + " ; " + price + " ; " + name);
    }
}

public class Static demo {
    public static void main(String[] args) {

        Demo obj1 = new Demo();
        obj1.brand = "Apple";
        obj1.price = 1500;
        obj1.name = "Smartphone";

        Demo obj2 = new Demo();
        obj2.brand = "Samsung";
        obj2.price = 1700;
        obj2.name = "Smartphone";

        obj1.show();
        obj2.show();
    }
}
