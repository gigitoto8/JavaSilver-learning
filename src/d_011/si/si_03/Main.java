package d_011.si.si_03;

abstract class A {
    abstract void hello();
}

class B extends A {
    void hello(int x) {
        System.out.print("B ");
    }
}

    
/*
問題③：abstract × override 忘れ

Q. これは OK？
OKのはず　×
↓
親と子のメソッドの引数シグネチャが違う
*/