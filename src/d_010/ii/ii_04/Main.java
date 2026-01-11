package d_010.ii.ii_04;

interface A {
    static void hello() {
        System.out.println("A");
    }
}

public class Main {
    public static void main(String[] args) {
        A.hello();
    }
}

/*
実装課題④：static の正しい呼び方
Q. 出力は？
    A
*/