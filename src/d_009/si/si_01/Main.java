package d_009.si.si_01;

interface Animal {
    void speak();
}

class Dog implements Animal {
    public void speak() {
        System.out.println("bow");
    }
}

class Cat implements Animal {
    public void speak() {
        System.out.println("meow");
    }
}

public class Main{
    public static void main(String[] args) {        
        Animal a = new Dog();
        a.speak();
    }


}

/*
JavaSilver問題①：多態性 × interface
Q1. 出力は？：bow
Q2. なぜ Dog のメソッドが呼ばれる？：
実体の処理が適用される
↓
メソッド呼び出しは実行時に実体クラスで解決される（動的ディスパッチ）
*/