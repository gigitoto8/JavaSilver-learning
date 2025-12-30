package d_004.si.si_02;

class A {
    static void test(){
        System.err.println("A");
    }
}

class B extends A {
    static void test(){
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
A：A
理由：？？？　×
↓
static メソッドはオーバーライドされない
*/


