public class student_encap {
    private int id;
    private String name;
    private int total_mrk;
    private String course;
    private boolean fees;

    public void get(int id, String name, int total_mrk, String course, boolean fees) {
        this.id = id;
        this.course = course;
        this.fees =  fees ;
        this.name = name;
        this.total_mrk = total_mrk;
    }

    public void set() {
        System.out.println(id + " " + course + " " + fees + " " + name + " " + total_mrk);
    }
    public static void main(String[] args) {
        student_encap obj1 = new student_encap();
        student_encap obj2 = new student_encap();
        student_encap obj3 = new student_encap();

        obj1.get(100, "sanjay", 250, "math", false);
        obj1.set();
    }
}
