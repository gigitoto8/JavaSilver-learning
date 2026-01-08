package d_009.si.si_02;

interface Animal {
    void speak();
}

class Dog implements Animal {
    public void speak() {
        System.out.println("bow");
    }
        public void run() {
        System.out.println("bowbowbow");
    }
}

class Cat implements Animal {
    public void speak() {
        System.out.println("meow");
    }
    public void run() {
        System.out.println("meowmeowmeow");
    }
}

public class Main{

    
    public static void main(String[] args) {

        Animal a = new Dog();
        a.speak();
        a.run();   // ← これ
        
    }

}


/*
JavaSilver問題②：型で「できること」が決まる
Q. コンパイルできる？
    できない
Q. なぜ？
    インターフェース元でrunメソッドが定義されていない
    ↓
    呼べるメソッドは「参照型」で決まる
*/