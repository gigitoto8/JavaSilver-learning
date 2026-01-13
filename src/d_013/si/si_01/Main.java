package d_013.si.si_01;

public class Main {
    public static void main(String[] args) {
        try {
            a();
        } catch (RuntimeException e) {
            System.out.print("R ");
        }
    }

    static void a() {
        b();
    }

    static void b() {
        throw new NullPointerException();
    }
}


/*
Java Silver 想定問題
問題①：例外はどこまで伝播？

Q. 出力は？:R 

理由（確認）

NullPointerException ⊂ RuntimeException

a() → b() → main() まで伝播
catch に捕まる
*/