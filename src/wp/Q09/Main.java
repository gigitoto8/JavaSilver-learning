package wp.Q09;

import java.io.*;

class A {
    void f() throws IOException {}
}

class B extends A {
    void f() throws FileNotFoundException {}
}

public class Main{
    public static void main(String[] args) {
        
    }
}
/*
【問題9】throws（override）
コンパイルできる？：コンパイルできる。実行時にエラー
*/