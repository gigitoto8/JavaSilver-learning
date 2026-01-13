package d_014.si.si_03;

abstract class A {
    abstract void f();
}

class B extends A {
    void f() {
        System.out.print("B ");
    }
}

public class Main {
    public static void main(String[] args) {
        A x = new B();
        x.f();
    }
}



/*
問題③：abstra：
Q. 出力は？：B 

理由
abstract クラスでも 多態性は通常通り
実体型のメソッドが呼ばれる
*/