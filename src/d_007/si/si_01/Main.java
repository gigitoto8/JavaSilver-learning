package d_007.si.si_01;

class A {
    String test() {
        return "A";
    }
}

class B extends A {
    String test() {
        return "B";
    }
}

public class Main {
    public static void main(String[] args) {
        A a = new B();
        System.out.println(a.test());
    }
}

/*
JavaSilver問題①：多態性 × オーバーライド
出力は？：B、なぜ？：
参照クラスのメソッドを呼ぶが、そのメソッドは実体クラスでオーバーライドされている
↓Silver的に言うと
「実行時の型（new B）」でメソッドが決まる
*/