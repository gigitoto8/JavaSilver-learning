package d_013.si.si_02;

import java.io.*;

class A {
    void f() throws IOException {
        throw new IOException();
    }
}

public class Main {
    public static void main(String[] args) {
        new A().f();
        System.out.print("OK ");
    }
}


/*
問題②：throws の意味

Q. コンパイルできる？:できる。出力は　OK 
↓
コンパイルエラー

理由

IOException は チェック例外
main() は
catch していない
throws も書いていない
*/