package wp.Q03;

class A {
    static void f() {
        System.out.print("A");
    }
}

class B extends A {
    static void f() {
        System.out.print("B");
    }
}

public class Main {
    public static void main(String[] args) {
        A a = new B();
        a.f();
    }
}


/*
【問題3】static（コンパイル時）
出力は？：A
*/