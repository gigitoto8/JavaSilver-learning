package d_014.ii.ii_02;
    
class A {
    String name = "A";
}

class B extends A {
    String name = "B";
}

public class Main {
    public static void main(String[] args) {
        A x = new B();
        System.out.print(x.name);
    }
}



/*
実装課題②：フィールドは多態しない
Q2. 出力は？:A
↓
フィールドは 参照型（A）基準
override という概念は存在しない
*/