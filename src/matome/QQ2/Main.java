package matome.QQ2;

import java.util.*;

class A {
    int x;
    A(int x) {
        this.x = x;
    }

    public boolean equals(Object o) {
        A a = (A)o;
        return this.x == a.x;
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
【復習2】equals / hashCode（致命ポイント） 
コンパイルできる？:できる 
出力は？；2 
なぜその結果になるか（1行で）：equalsが未オーバーライドのため
↓
hashCode をオーバーライドしていないため、HashSet が同一と判断できない
*/