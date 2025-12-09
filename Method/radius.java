public class radius {
    public static void main(String[] args) {
        area_circle(3);
    }

    public static void area_circle(int r) {
        System.out.println("radius : " + r);
        double area = 3.14 * r * r ;
        System.out.println(area);
    }
}
