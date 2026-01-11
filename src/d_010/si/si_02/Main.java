package d_010.si.si_02;

interface A {
    default void hello() {
        System.out.print("A ");
    }
}

class B implements A {
    public void hello() {
        System.out.print("B ");
    }
}

public class Main {
    public static void main(String[] args) {
        A a = new B();
        a.hello();
    }
}

/*
問題②：default メソッドのオーバーライド
Q. 実行結果は？
B
↓
defaultクラスはオーバーライド可能

*/