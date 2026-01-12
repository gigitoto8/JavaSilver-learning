package d_012_5.si;

class si_01_A {
    void f() {
        System.out.println("A");
    }
}

class si_01_B extends si_01_A {
    void f(int x) {
        System.out.println("B");
    }
}

public class si_01 {
    public static void main(String[] args) {
        new si_01_B().f();
    }
}    

/*
問題①

Q1
f() は？:どちらでもない
new B().f(); は？：オーバーロード　×
↓
呼べるが、オーバーロードではない
↓
正確な言い方
継承関係はあるが、メソッドとしての関係はない

*/