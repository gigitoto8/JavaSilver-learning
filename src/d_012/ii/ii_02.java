package d_012.ii;

class ii_02_A {
    protected void hello() {
        System.out.print("A ");
    }
}

class ii_02_B extends ii_02_A {
    public void hello() {
        System.out.print("B ");
    }
}

public class ii_02 {
    public static void main(String[] args) {
        ii_02_A x = new ii_02_B();
        x.hello();
    }
}

/*
実装課題②：アクセス修飾子の罠
Q2. コンパイルできる？
できない。継承元のメソッドがprotectedなので。
override 時、アクセス範囲は狭められない
*/