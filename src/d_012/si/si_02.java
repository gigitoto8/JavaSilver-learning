package d_012.si;

class si_02_A {
    private void hello() {
        System.out.print("A ");
    }
}

class si_02_B extends si_02_A {
    void hello() {
        System.out.print("B ");
    }
}

public class si_02 {
    public static void main(String[] args) {
        new si_02_B().hello();
    }
    
}    

/*
JavaSilver問題②：private メソッドの罠
Q. 出力は？
エラー。オーバーロード元のメソッドがprivate　×
↓
B 　privateメソッドは継承されない。AとBのhello()は完全に別メソッド
*/