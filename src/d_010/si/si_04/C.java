package d_010.si.si_04;

interface A {
    default void hello() {
        System.out.print("A ");
    }
}

interface B {
    default void hello() {
        System.out.print("B ");
    }
}

class C implements A, B {
    public static void main(String[] args) {
        
    }
}


/*
問題④：default × 多重実装（衝突）
Q. これはコンパイルできる？
できない
↓
default メソッドが 同じシグネチャで衝突、
クラス側で 必ずオーバーライドが必要
*/