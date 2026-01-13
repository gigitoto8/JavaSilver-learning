package matome.Q1;

class A {
    void f(Object o) {
        System.out.print("A");
    }
}

class B extends A {
    void f(String s) {
        System.out.print("B");
    }
}

public class Main {
    public static void main(String[] args) {
        A a = new B();
        a.f("hello");
    }
}


/*
【問題1】オーバーロード／オーバーライド判定
出力は？:B ×
理由：オーバーライドで実体のメソッドを適用　×
↓
出力：A
理由：
なぜ？
A a = new B();
a.f("hello");


参照型：A

実体型：B

重要ポイント

オーバーロード判定はコンパイル時

参照型 A が持つメソッドだけを見る

class A {
    void f(Object o) {}
}


👉 f(String) は A には存在しない

→ f(Object) が選ばれる
→ 実体は B だが overrideされていない
→ A.f(Object) が実行される

あなたのズレ

「実体のメソッドが呼ばれる」

これは override の話
今回は overload の話
*/