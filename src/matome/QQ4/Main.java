package matome.QQ4;

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
【復習4】static の隠蔽（OKパターン）
コンパイルできる？:できる
出力は？:A
なぜ B が出ない？:staticはoverrideしない
*/