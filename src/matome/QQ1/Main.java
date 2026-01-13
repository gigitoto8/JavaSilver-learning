package matome.QQ1;

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
        a.f("java");
    }
}
/*
【復習1】オーバーロード vs オーバーライド（最頻出）
コンパイルできる？:できる
出力は？：A
この呼び出しは
override / overload / どれでもない のどれ？：overload
*/