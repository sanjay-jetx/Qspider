import java.util.*;
public class city {
    private String location;
    private int capacity;
    private int no_of_people;
    private int no_of_rooms;
    
    public void set_all(String location, int capacity, int no_of_people, int no_of_rooms) {
        this.location = location;
        this.capacity = capacity;
        this.no_of_people = no_of_people;
        if (no_of_people >  4) {
            this.no_of_rooms = no_of_rooms;
        }
        else {
            this.no_of_rooms = 0;
        }
    }

    public void get_all() {
        System.out.println(location + " " + capacity + " " + no_of_people + " " + no_of_rooms);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        city obj1 = new city();
        obj1.set_all(sc.next(), sc.nextInt(), sc.nextInt(), sc.nextInt());
        obj1.get_all();


    }
}
