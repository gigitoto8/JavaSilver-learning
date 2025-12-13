class Test {
    String msg;

    void print() {
        System.out.println(msg);
    }
}

public class Main2 {
    public static void main(String[] args) {
        Test t = new Test();
        t.print();
    }
}