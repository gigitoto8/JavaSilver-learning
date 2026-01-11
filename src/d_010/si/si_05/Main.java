package d_010.si.si_05;

interface A {
    default void hello() {
        System.out.print("A ");
    }
}

interface B {
    default void hello() {
        System.out.print("B ");
    }
}

class C implements A, B {
    public void hello() {
        A.super.hello();
        B.super.hello();
    }
}

public class Main {
    public static void main(String[] args) {
        new C().hello();
    }
}

/*
問題⑤：衝突の解決（正解パターン）
Q. 実行結果は？
A B 
インターフェース名.super.メソッド() で明示指定可能
*/