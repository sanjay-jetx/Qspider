package relationship.phone_driver;

public class hone_driver_main {
    public static void main(String[] args) {
        phone sc = new phone();
        sc.battery_capa = 10;
        // System.out.println(sc.battery_capa);

        sc.add("jio", 10000);
        System.out.println((sc.siim == null ? " " : sc.siim.operators));
    }
}
