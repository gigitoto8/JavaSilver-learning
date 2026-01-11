package d_010.si.si_01;

interface A {
    default void hello() {
        System.out.print("A ");
    }
}

class B implements A {
}

public class Main {
    public static void main(String[] args) {
        A a = new B();
        a.hello();
    }
}

/*
問題①：default メソッドの基本
Q. 実行結果は？
A
↓
defaultメソッドは、実装クラスに実装しなくても呼べる
*/