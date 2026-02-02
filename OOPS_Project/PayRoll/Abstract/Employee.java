package PayRoll.Abstract;

public abstract class Employee {
    
    private double BasicSalary;

    public double getBasicSalary() {
        return BasicSalary;
    }

    public void setBasicSalary(int BasicSalary) {
        this.BasicSalary = BasicSalary;
    }

    public abstract double CalculateSalary(int a);

    public double DisplaySalary(int a) {
        return a;
    }

}
