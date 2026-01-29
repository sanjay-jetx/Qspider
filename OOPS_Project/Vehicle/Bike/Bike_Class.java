package Vehicle.Bike;

import Vehicle.AbstractClass.*;


public class Bike_Class extends Abstract_class {
    String fuel;

    public void move(String fuel) {
        this.fuel = fuel;
        System.out.println(fuel);
    }

    public static void main(String[] args) {
        Abstract_class Bike_obj = new Bike_Class();
        Bike_obj.setSpeed(100);
        System.out.println(Bike_obj.getSpeed());
        Bike_obj.move("petrol");
    }
}
