public class method {
    public static void main(String[] args) {
        System.out.println("main starts");
        demo();
        //object creation
        method demo1 = new method();
        demo1.start();
        System.out.println("main ends");
    }

        //static 
        public static void demo() {
            System.out.println("method-1");

            method demo1 = new method();
            demo1.start();
        }
         //non-static
        public void start(){
            System.out.println("method-2");
    }
    
}
