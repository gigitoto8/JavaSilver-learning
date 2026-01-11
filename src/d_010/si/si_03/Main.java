package d_010.si.si_03;

interface A {
    static void hello() {
        System.out.print("A ");
    }
}

class B implements A {
}

public class Main {
    public static void main(String[] args) {
        B b = new B();
        b.hello();
        //A.hello();
    }
}


/*
問題③：static メソッドはどう呼ぶ？
Q. どうなる？
    エラー、コンパイルできない
    ↓
    static メソッドは インスタンスから呼べない
*/