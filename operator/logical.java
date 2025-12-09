public class logical {
    public static void main(String[] args) { 
        String t_size = "small";
        String my_size = "small";
        int price = 500; 
        int my_price = 700;
        int val = 100;
        // AND operator
        boolean value = (t_size == my_size) && (price < my_price);
        
        //OR operator
        boolean value2 = (t_size != my_size) || (price > my_price);
        
        // NOT operator
        boolean value3 = !(price > my_price);
       
        System.out.println(value);
        System.out.println(value2);
        System.out.println(value3);


    }
    
}
