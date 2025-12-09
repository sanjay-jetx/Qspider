public class Final {
    public static void main(String[] args) {
        //int a = 10;
       // int b = 20;

       Integer a = 10 ;
       Integer b = 20;
       swap(a, b);

      
       System.out.println(a + " " + b);
       
       name obj1 = new name("sanjay M"); 
         

    }
    static void swap(Integer a , Integer b){
        Integer temp = a;
        a = b ;
        b = temp ;
        System.out.println(a+" "+b);
    }
}
class name {
    final int num= 10;
    String name;

    name(String name) {
        this.name = name;
    }

}