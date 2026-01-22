package relationship.Has_RelationShip;
public class Car_Engine_Radio {
    public static void main(String[] args) {
        Car ca = new Car();
        ca.Add_engine(100, "petrol");
        ca.Add_Rd("dont_know", 800);
    }
}

class Car {
    
    Radio rd;

    public void Add_Rd(String brand, int price) {
        rd = new Radio();
        rd.brand = brand;
        rd.price = price;
        System.out.println(rd.brand + " " + rd.price);
    }
    

    Engine En = new Engine();

    public void Add_engine(int HP, String fuel_type) {
        En.fuel_type = fuel_type;
        En.HP = HP;
    }
}

class Engine {
    int HP;
    String fuel_type;
}

class Radio {
    String brand;
    int price;


}
