package d_004.si.si_01;

class A {
    void test(){
        System.err.println("A");
    }
}

class B extends A {
    void test(){
        System.err.println("B");
    }
}


public class Main {
    public static void main(String[] args) {
        A obj = new B();
        obj.test();
    }
}

/*
Q：出力は？
A：B
理由：A型のメソッドtestを呼び出すが、
そのメソッドはBでオーバーライドされている
↓模範
インスタンスメソッドは実体（newされたクラス）で決まるため
*/