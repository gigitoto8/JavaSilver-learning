package d_007.si.si_02;

class A {
    static String test() {
        return "A";
    }
}

class B extends A {
    static String test() {
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
JavaSilver問題②：static × 継承
出力は？：A、JavaSilver的に「何が起きている」？：staticメソッドはオーバーライドされない

static は 隠蔽（hiding）、参照型（A）で決まる
*/