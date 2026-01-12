package d_012.ii;

class ii_01_A {
    void hello() {
        System.out.print("A ");
    }
}

class ii_01_B extends ii_01_A {
    void hello(int x) {
        System.out.print("B ");
    }
}

public class ii_01 {
    public static void main(String[] args) {
        //new ii_01_B().hello();
        ii_01_A x = new ii_01_B();
        x.hello();
        //x.hello(2);
    }
}

/*
実装課題①：override か overload か？
Q1.hello() は override？ overload？
overload　×
↓
overloadでもoverrideでもない
new B().hello(); は呼べる？
呼べる
↓
呼べない
*/