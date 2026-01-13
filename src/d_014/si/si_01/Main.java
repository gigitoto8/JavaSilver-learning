package d_014.si.si_01;

class A {}
class B extends A {}
class C extends A {}

public class Main {
    public static void main(String[] args) {
        A x = new C();
        B b = (B)x;
        System.out.print("OK ");
    }
}



/*
問題①：downcast の罠
Q. コンパイルできる？実行できる？：コンパイルも実行もできない　×
↓
コンパイルできるが、実行すると例外発生
キャスト自体は 文法的に OK
ただし実体は C
C → B には変換できない

なぜ？

コンパイル時
A → B
継承関係があるため OK

実行時
実体は C
C は B ではない

downcast の正しい考え方（Silver必須）

A x = new B();   // OK（upcast）
B b = (B)x;     // OK（実体がB）

A x = new C();
B b = (B)x;     // NG（実体が違う）



*/