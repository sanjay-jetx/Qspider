package Vehicle.Bike;

import Vehicle.Abstract_Class.Abstract_Class;

public class Bike_Class extends Abstract_Class {

    @Override
    public void move(String fuel) {
        System.out.println("Bike runs using " + fuel);
    }

    public static void main(String[] args) {
        Abstract_Class bike = new Bike_Class(); // upcasting
        bike.setSpeed(100);
        System.out.println(bike.getSpeed());
        bike.move("petrol");
    }
}

