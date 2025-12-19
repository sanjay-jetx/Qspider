public class This {
    public static void main(String[] args) {
        student student1 = new student();
        System.out.println(student1.rollno);

        student student2 = new student(26,  126);
        System.out.println(student2.rollno);

        student random = new student(student1); //we pass the value of the student 1 into random
        System.out.println(random.name);

        //student random2=new student(); //when it is default and go down
        // System.out.println(random.name);
        

        student one = new student();
        // assigning value to the one = two
        student two = one;
        one.name = "something nothing";

        System.out.println(two.name);
    }
  
    static class student {
        int rollno;
        int marks;
        String name;

        // constructor 1  

        student() {
            this.rollno = 10;
            this.marks = 50;
            this.name = "sanjay";

        }

        /*   student() {
        this(13,"default value",50) //this automatically print this
        }
        */

        // constructor 2 

        student(int r, int b) {
            rollno = r;
            marks = b;
        }

        student(int rollno, int marks, String name) {
            this.rollno = rollno;
            this.marks = marks;
            this.name = name;
        }

        student(student other) {
            this.rollno = other.rollno;
            this.marks = other.marks;
            this.name = other.name;
        }
    }
}  

