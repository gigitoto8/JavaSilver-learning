package d_007.si.si_03;

class A {
    int x;
    A(int x) {
        this.x = x;
    }
}

public class Main {
    public static void main(String[] args) {
        A a1 = new A(10);
        A a2 = new A(10);
        
        System.out.println(a1.equals(a2));
    }
}

/*
JavaSilver問題③：equals × 継承
出力は？：true　×　→　正解　false
なぜ？：a1とa2の参照先に保存されている値が等しいため ×
⇒　正
equals を オーバーライドしていない
→ Object.equals が呼ばれる
→ 参照比較（== と同じ）
👉
値が同じでも false
*/