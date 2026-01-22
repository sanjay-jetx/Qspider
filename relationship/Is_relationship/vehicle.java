package relationship.Is_relationship;
class Vehicle1 {
    void start() {
        System.out.println("Vehicle is starting");
    }

    void stop() {
        System.out.println("Vehicle is stopping");
    }
}

class Car extends Vehicle1 {
    void playMusic() {
        System.out.println("Car is playing music");
    }
}

public class vehicle {
    public static void main(String[] args) {
        Car c = new Car();
        c.start();
        c.playMusic();
        c.stop();
    }
}
