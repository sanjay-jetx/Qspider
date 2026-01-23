
class Wpp {
    void test() {
        System.out.println("Wpp-1");
    }
}

class Wpp1 extends Wpp {
    void audiocall() {
        System.out.println("ac");
    }
}

class Wpp2 extends Wpp1 {
    void videocall() {
        System.out.println("vc");
    }
}
public class Driver2 {
    public static void main(String[] args) {
        Wpp2 w2 = new Wpp2();
        w2.test();      
        w2.audiocall(); 
        w2.videocall();

        Wpp1 w1 = new Wpp1();
        w1.test();      
        w1.audiocall();
        
        Wpp w = new Wpp();
        w.test();
    }
}

