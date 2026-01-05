public class constructotor2 {
    public static void main(String[] args) {
        method_name obj1 = new method_name(12, 13);

        method_name obj2 = new method_name(14, 16);
        
        obj2.mathod();
        obj1.mathod();

    }
}

class method_name {
    int id;
    int roll;
     
    method_name(int a, int b) {
        id = a;
        roll = b;
    }

    void mathod(){
        System.out.println(this.id +" "+ this.roll); 
    }
}