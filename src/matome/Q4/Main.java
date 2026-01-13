package matome.Q4;

import java.util.*;

class A {
    int x;
    A(int x) {
        this.x = x;
    }
}

public class Main {
    public static void main(String[] args) {
        Set<A> set = new HashSet<>();
        set.add(new A(10));
        set.add(new A(10));

        System.out.print(set.size());
    }
}

/*
【問題4】equals / hashCode（最重要）
出力は？:1　×
↓
2
理由:setは値の重複は認められない　×
↓
equals 未オーバーライド
hashCode 未オーバーライド
→ Objectのequals（参照比較）

equals が true の場合にのみ重複とみなす

👉 「値」ではなく
👉 equals/hashCode の結果

*/