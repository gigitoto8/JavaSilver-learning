package d_010.ii.ii_06;

interface A {
    default void hello() {
        System.out.println("A");
    }
}

interface B {
    default void hello() {
        System.out.println("B");
    }
}

public class Main implements A, B {
    public void hello() {
        A.super.hello();
    }
    public static void main(String[] args) {
        Main c = new Main();
        c.hello();
    }
}

/*
実装課題⑥：多重実装の解決方法（Silver必須）
Q. 出力は？
    A

    衝突した default は、実装クラスで明示的に解決する
*/