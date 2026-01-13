package d_014.si.si_02;

class A {}
class B extends A {}

public class Main {
    public static void main(String[] args) {
        A x = new B();

        System.out.print(x instanceof A);
        System.out.print(" ");
        System.out.print(x instanceof B);
    }
}



/*
問題②：instanceof 判定
Q. 出力は？:true false ×
↓
true true

理由

x instanceof A → true
x instanceof B → true

👉 instanceof は

「実体がその型か、サブクラスか」

instanceof の本質
実体	判定
B instanceof B	true
B instanceof A	true
A instanceof B	false
*/