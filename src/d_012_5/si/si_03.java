package d_012_5.si;

class A {
    static void f() {}
}

class B extends A {
    void f() {}
}

public class si_03 {
    
}    

/*
問題③
Q3

コンパイルできる？：できない
override / overload / どれ：どれでもない。
staticメソッドはoverrideもoverloadもできない 

理由
static は 継承されない
B の f() は 新規インスタンスメソッド

static と instance の同名・同引数メソッドは共存できない
 */