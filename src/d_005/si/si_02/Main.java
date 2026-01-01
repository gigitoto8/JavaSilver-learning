package d_005.si.si_02;

import java.io.IOException;

class A {
    void test() throws IOException{}
}

class B extends A{
    void test() throws Exception{}
}


public class Main {
    public static void main(String[] args){
    }
}

/*
⑥ JavaSilver問題②（throws vs catch）
問い

Q.コンパイルできる？
A.できない

Q.理由は？
A.言葉がまとまらない
　Bで宣言しているメソッドのthrowsが
　継承元Aで宣言しているメソッドのthrowsよりも上位であり都合が悪い？
↓

正確なルール（超重要）
オーバーライド時の throws 制限
親メソッドが throws している チェック例外
子メソッドでは：
同じ例外　または そのサブクラス　または throws を消す
👉 これしか許されない

ダメな例
class A {
    void test() throws IOException {}
}
class B extends A {
    void test() throws Exception {} // ← 広げている
}
理由：
Exception は IOException の 親
throws 範囲を広げることになるため NG
↓
OKな例
void test() throws FileNotFoundException {}
void test() {}

一言で言うと　オーバーライドで throws は「狭くする方向」しか許されない
*/