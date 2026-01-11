package d_010.ii.ii_01;

interface A {
    default void hello() {
        System.out.println("A");
    }
}

class B implements A {
}

public class Main {
    public static void main(String[] args) {
        B b = new B();
        b.hello();
    }
}

/*
実装課題①：default メソッドの基本
Q1. 出力は？
    エラーが出る。　×
    ↓
    A
Q2. なぜ B に hello がなくても呼べる？
    hello()はinterface側で既に実装済み
    Bはそれをそのまま継承する
    ↓
    default メソッドは「実装を持ったメソッド」
*/