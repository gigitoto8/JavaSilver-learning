package d_011.si.si_02;

abstract class A {
    abstract void hello();
}

class B extends A {
}

public class Main {
    public static void main(String[] args) {
        A a = new B();
    }
}

/*
JavaSilver問題②：abstract メソッド未実装
Q. コンパイルできる？
できない。クラスBでhelloメソッドをオーバーライドする必要がある。
*/