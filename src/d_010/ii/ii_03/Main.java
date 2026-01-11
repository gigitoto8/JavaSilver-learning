package d_010.ii.ii_03;

interface A {
    static void hello() {
        System.out.println("A");
    }
}

class B implements A {
}

public class Main {
    public static void main(String[] args) {
        B b = new B();
        b.hello();      // ← ここ
        //A.hello();    //←これならエラーにならない
    }
}

/*
実装課題③：static メソッド（超頻出）
Q1. コンパイルできる？
できない
Q2. なぜ？
Bでメソッドの具体的な処理を定義していないため？　×
↓
interface の static メソッドは、インターフェース名でしか呼べない
（interface の static メソッドは、
クラスにもインスタンスにも継承されない）

*/