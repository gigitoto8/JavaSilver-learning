package wp.Q04;

class A {
    int x = 1;
}

class B extends A {
    int x = 2;
}

public class Main {
    public static void main(String[] args) {
        A a = new B();
        System.out.print(a.x);
    }
}


/*
【問題4】フィールド（多態しない）
出力は？：1
*/