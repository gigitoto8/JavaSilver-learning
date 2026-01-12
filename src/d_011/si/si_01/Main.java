package d_011.si.si_01;

abstract class A {
    void hello() {
        System.out.print("A ");
    }
}



public class Main extends A{
    public static void main(String[] args) {
        A a = new A();
        a.hello();
    }
}

/*
JAvaSilver問題①：インスタンス化の罠
Q. どうなる？
抽象クラスはインスタンス化できない
具象クラス経由でインスタンス化する必要がある
*/