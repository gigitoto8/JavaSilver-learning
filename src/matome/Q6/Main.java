package matome.Q6;

interface A {
    default void f() {
        System.out.print("A");
    }
}

interface B {
    default void f() {
        System.out.print("B");
    }
}

class C implements A, B {

}



/*
【問題6】interface × default（衝突）

コンパイルできる？:できない
理由：各interfaceで同名のメソッドが定義されている
↓
補足すると：

class C implements A, B {
    public void f() { A.super.f(); }
}

のように 明示実装すれば解決可能。
*/