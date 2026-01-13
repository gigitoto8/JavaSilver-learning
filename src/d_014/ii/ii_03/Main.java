package d_014.ii.ii_03;

class A {
    static void hello() {
        System.out.print("A ");
    }
}

class B extends A {
    static void hello() {
        System.out.print("B ");
    }
}

public class Main {
    public static void main(String[] args) {
        A x = new B();
        x.hello();
    }
}

/*
実装課題③：static は多態しない
Q3. 出力は？:A 
static メソッドは override されない
static は 参照型で決まる
実体型は一切見ない
参照型（A）で決まる
*/