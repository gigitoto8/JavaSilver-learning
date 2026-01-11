package d_010.ii.ii_02;

interface A {
    default void hello() {
        System.out.println("A");
    }
}

class B implements A {
    public void hello() {
        System.out.println("B");
    }
}

public class Main {
    public static void main(String[] args) {
        A a = new B();
        a.hello();
    }
}

/*
実装課題②：default メソッドのオーバーライド
Q1. 出力は？
    B
Q2. なぜ？
    オーバーライドでクラスBの処理を適用する
    ↓
    補足（Silver頻出）
クラスのメソッドは interface の default より優先される
*/