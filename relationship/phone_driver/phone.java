package relationship.phone_driver;
public class phone {
    int battery_capa;
    String brand;
    String os;
    sim siim;

    public void add(String operators, int balance) {
        siim = new sim();
        siim.operators = operators;
        siim.balance = balance;
       // System.out.println(operators + " " + balance);
    }


     public void remove(String operators, int balance) {
         siim = null;
    }
}
