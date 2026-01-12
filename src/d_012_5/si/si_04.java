package d_012_5.si;

class si_04_A {
    private void f() {}
}

class si_04_B extends si_04_A {
    void f() {}
}

public class si_04 {
    
}    

/*
問題④

Q4

コンパイルできる？：できる
f() は何扱い？：継承元・継承先のf()は互いに無関係
*/