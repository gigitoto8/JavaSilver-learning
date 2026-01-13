package matome.Q2;

class A {
    static void f() {
        System.out.print("A");
    }
}

class B extends A {
    static void f() {
        System.out.print("B");
    }
}

public class Main {
    public static void main(String[] args) {
        A a = new B();
        a.f();
    }
}


/*
【問題2】static の罠
出力は？:A
理由：staticは参照型のメソッドを適用 ×
↓
static は overrideされない
クラス名（＝参照型）で解決される
多態性に参加しない
*/