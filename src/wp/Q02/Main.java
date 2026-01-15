package wp.Q02;

class A {
    void f() {
        System.out.print("A");
    }
}

class B extends A {
    void f() {
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
【問題2】override（実行時）
出力は？：B
*/