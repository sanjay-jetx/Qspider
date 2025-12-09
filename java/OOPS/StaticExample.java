class Demo {
    String  brand;
    int  price;
    static String name;

    public void show() {
        System.out.println(brand + " ; " + price + " ; " + name);
    }

    public static void show1(Demo obj1){
        System.out.println(obj1.brand + " ; " + obj1.price + " ; " + name);
    }
}

public class StaticExample {
    public static void main(String[] args) {

        Demo obj1 = new Demo();
        obj1.brand = "Apple";
        obj1.price = 1500;
        Demo.name = "Smartphone";

        Demo obj2 = new Demo();
        obj2.brand = "Samsung";
        obj2.price = 1700;
        Demo.name = "Smartphone";

        obj1.name = "Phone"; 
        // show the output
        obj1.show();
        obj2.show();

        Demo.show1(obj1);
    }
}
