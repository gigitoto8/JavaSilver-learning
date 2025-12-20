import java.util.*;

class A {
    int x;
    A(int x) {
        this.x = x;
    }
}

public class Main {
    public static void main(String[] args) {
        List<A> list = new ArrayList<>();
        A a1 = new A(10);
        list.add(a1);
        a1.x = 20;
        System.out.println(list.get(0).x);
    }
}

//Q:出力は？
//A."20"　と表示　○