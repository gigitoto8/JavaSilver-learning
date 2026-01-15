package wp.Q05;

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
        set.add(new A(5));
        set.add(new A(5));
        System.out.print(set.size());
    }
}


/*
【問題5】equals / hashCode（基本）
出力は？：2
*/