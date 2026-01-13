package matome.Q5;

abstract class A {
    abstract void f();
}

class B extends A {
}

public class Main {
    public static void main(String[] args) {
        A a = new B();
        a.f();
    }
}


/*
【問題5】abstract クラス

コンパイルできる？：できない
理由：abstractクラスの継承先で、f()メソッドを実装していない
*/