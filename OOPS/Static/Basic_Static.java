package Static;

public class Basic_Static {
    public static void main(String[] args) {
        Human obj1 = new Human("sanjay", 20);
        System.out.println(obj1.population);
    }
}


class Human {
    String Name;
    int Age;
    static long population;
    
    void greeting() {
        invite();
        System.out.println("hoo");
    }

    static void invite() {
        //greeting();
        System.out.println("hii");
    }

    Human(String Name,int Age){
        this.Name=Name;
        this.Age=Age;
        Human.population+=1;

    }
}