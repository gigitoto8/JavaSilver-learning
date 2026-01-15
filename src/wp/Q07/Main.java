package wp.Q07;

import java.util.*;

class A {
    int x;
    A(int x) {
        this.x = x;
    }
    public boolean equals(Object o) {
        return this.x == ((A)o).x;
    }
    public int hashCode() {
        return x;
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
【問題7】hashCode & equals 両方 override
出力は？：1
*/