package wp.Q01;

class A {
    void f(Object o) {
        System.out.print("A");
    }
}

class B extends A {
    void f(String s) {
        System.out.print("B");
    }
}

public class Main {
    public static void main(String[] args) {
        A a = new B();
        a.f(null);
    }
}

/*
【問題1】overload / override 判定
出力は？：A

*/