package d_012.si;

class si_01_A {
    static void hello() {
        System.out.print("A ");
    }
}

class si_01_B extends si_01_A {
    static void hello() {
        System.out.print("B ");
    }
}

public class si_01 {
    public static void main(String[] args) {
        si_01_A a = new si_01_B();
        a.hello();
    }    
}

/*
JavaSilver問題①：static は override される？
Q. 出力は？
できない
↓
A  理由：staticはオーバーライドされない
出力結果は参照型で決まる。
*/