import java.util.ArrayList;

public class list {
    public static void main(String[] args) {
        ArrayList<String> name = new ArrayList<>();
        name.add("sa");
        name.add("qw");
        String str = name.get(0);
        System.out.println(str);
        name.set(0, "sanjay");
        System.out.println(name);
        name.remove(0);
        System.out.println(name);
    }
}
