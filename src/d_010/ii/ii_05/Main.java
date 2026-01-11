package d_010.ii.ii_05;

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

class C implements A, B {
}

/*
実装課題⑤：default × 多重実装（地雷）
Q1. コンパイルできる？
    できない
Q2. できないなら理由は？
    派生元？のAとBで同じ名前のメソッドを定義している
    ↓正確には
    どちらの default メソッドを使うか、Javaが判断できないため
    default メソッドの衝突
*/