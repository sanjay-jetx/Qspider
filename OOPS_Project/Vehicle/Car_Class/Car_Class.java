package Vehicle.Car_Class;

// import Vehicle.Abstract_Class.Abstract_Class;
import Vehicle.Abstract_Class.*;

public class Car_Class extends Abstract_Class {

    @Override
    public void move(String fuel) {
        System.out.println("Car runs using " + fuel);
    }

    public static void main(String[] args) {
        Abstract_Class car = new Car_Class(); // upcasting
        car.setSpeed(180);
        System.out.println(car.getSpeed());
        car.move("diesel");
    }
}
