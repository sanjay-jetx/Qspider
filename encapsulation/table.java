package encapsulation;

public class table {

    private String color;
    private String material;
    private String no_of_owners;
    private boolean damages;
    private boolean drawers;

    public void setDetails(String color, String material, String no_of_owners,
            boolean damages, boolean drawers) {
        this.color = color;
        this.material = material;
        this.no_of_owners = no_of_owners;
        this.damages = damages;
        this.drawers = drawers;
    }
    
    public String getColor() {
        return color;
    }

    public String getMaterial() {
        return material;
    }

    public String getNoOfOwners() {
        return no_of_owners;
    }

    public boolean hasDamages() {
        return damages;
    }

    public boolean hasDrawers() {
        return drawers;
    }

    public static void main(String[] args) {
        table t = new table();
        t.setDetails("Brown", "Wood", "2", false, true);

        System.out.println(t.getColor());
        System.out.println(t.getMaterial());
        System.out.println(t.hasDrawers());

        table t1 = new table();
        t1.setDetails("blue", "steel", "3", true, false);

        System.out.println(t1.getColor());
        System.out.println(t1.getMaterial());
        System.out.println(t1.hasDrawers());

        table t2 = new table();
        t2.setDetails("Green", "steel", "5", false, true);

        System.out.println(t2.getColor());
        System.out.println(t2.getMaterial());
        System.out.println(t2.hasDrawers());

        int arr[] = { 1, 2, 3, 4, 5 };
        arrayy(arr);
    }

    public static void arrayy(int arr[]) {
        int sum = 0;
        for(int i : arr){
            sum+=i;
        }
        System.out.println(sum);
    }
}
