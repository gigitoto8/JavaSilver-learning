package d_014.ii.ii_01;

class A {
    void hello() {
        System.out.print("A ");
    }
}

class B extends A {
    void hello() {
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
実装課題①：参照型と実体型
Q1. 出力は？:B 
↓
メソッド呼び出しは実体型（B）基準
override があれば必ず 実体型
*/