package Vehicle.Abstract_Class;

public abstract class Abstract_Class {
    private int speed;

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public abstract void move(String fuel);
}
