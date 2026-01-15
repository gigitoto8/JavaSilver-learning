package wp.Q08;

class A {}
class B extends A {}

public class Main {
    public static void main(String[] args) {
        A a = new B();
        System.out.print(a instanceof B);
    }
}




/*
【問題8】instanceof（実体を見る）
出力は？：true
*/