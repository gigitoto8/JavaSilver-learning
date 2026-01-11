package d_011.ii.ii_02;

abstract class A {
    abstract void a();
    void b() {
        System.out.print("B ");
    }
}

class C extends A {
    public void a() {
        System.out.print("A ");
    }
}

public class Main {
    public static void main(String[] args) {
        A x = new C();
        x.a();
        x.b();
    }
}

/*
実装課題②：abstract + 実装済みメソッド
Q2. 実行結果は？
A B 
*/