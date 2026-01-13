package matome.QQ3;

class A {
    void f() {
        System.out.print("A");
    }
}

class B extends A {
    static void f() {
        System.out.print("B");
    }
}

/*
【復習3】static × override（今回の核心）
コンパイルできる？:できない
その理由を 1文で正確に 書け:インスタンスメソッドを static メソッドで隠すことはできない
*/