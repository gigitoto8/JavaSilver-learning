package d_012_5.si;

class si_05_A {
    Object f() { return null; }
}

class si_05_B extends si_05_A {
    String f() { return ""; }
}

public class si_05 {
    public static void main(String[] args) {
        
    }
}    

/*
問題⑤

Q5

コンパイルできる？：できる
何が起きている？：特に何も起きていないと思う
↓
override（共変戻り値）

何が起きている？

戻り値が
Object → String
サブクラス型への変更は OK
👉 Silver 頻出ワード：共変戻り値
*/