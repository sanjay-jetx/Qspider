package PayRoll.Concrete;
import PayRoll.Abstract.*;

public class PermanentEmp extends Employee {
    public PermanentEmp() {
        setBasicSalary(120000);
    }


    @Override
    public double calculateSalary() {
        return getBasicSalary();
    }
}

