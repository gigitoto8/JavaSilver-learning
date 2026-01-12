package d_012_5.si;

class si_02_A {
    protected void f() {
        System.out.println("A");
    }
}

class si_02_B extends si_02_A {
    public void f() {
        System.out.println("B");
    }
}

public class si_02 {
    public static void main(String[] args) {
        new si_02_B().f();
    }
}    

/*
問題②

Q2

コンパイルできる？:
アクセス修飾子が継承元よりも継承先の方が弱いのでできないはずだが、
なぜかできる
↓
public は　protected よりも緩い
f() は override？：overrideではない
↓
override

override 時のルール：
アクセス修飾子は広げるのは OK
狭めるのが NG
*/