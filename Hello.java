class hello {
    public static int add(int a, int b) {
        return a + b;
    }

    public int multi(int d, int f) {
        return d * f;
    }

    public static void main(String[] args) {
        int sum = hello.add(10, 20);
        System.out.println(sum);
        hello obj = new hello();
        int multi = obj.multi(2, 5);
        System.out.println(multi);

    }
}