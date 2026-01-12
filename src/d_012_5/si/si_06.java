package d_012_5.si;

class si_06_A {
    void f() throws IOException {}
}

class si_06_B extends si_06_A {
    void f() throws FileNotFoundException {}
}

public class si_06 {
    
}    

/*
問題⑥
Q6

コンパイルできる？：できない
理由は？：Bのメソッドで投げかけている例外が
Aのメソッドで投げかけている例外よりも範囲が広い
↓BがAよりも広い
*/