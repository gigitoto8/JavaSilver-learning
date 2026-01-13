package matome.Q3;

class A {
    int x = 10;
}

class B extends A {
    int x = 20;
}

public class Main {
    public static void main(String[] args) {
        A a = new B();
        System.out.print(a.x);
    }
}


/*
【問題3】フィールドは多態しない
出力は？:10
理由：フィールドは参照型が適用される
*/