package OOPS_Project.Vehicle.AbstractClass;

public abstract class Abstract_class {
    private int speed;
    int getspeed;

    public int getSpeed() {
        return getspeed;
    }

    public void setSpeed(int a) {
        this.getspeed = a;
    }

    public abstract void move(String fuel);
}
