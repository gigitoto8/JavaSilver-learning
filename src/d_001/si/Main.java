//出力は？

class A {
    int x = 10;
}

public class Main {
    public static void main(String[] args) {
        A a1 = new A();
        A a2 = a1;
        a2.x = 20;
        System.out.println(a1.x);
    }
}