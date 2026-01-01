package d_005.etc;

import java.io.IOException;

public class RethrowSample {

    static void methodA() throws IOException {
        throw new IOException("Aで発生");
    }

    static void methodB() throws IOException {
        try {
            methodA();
        } catch (IOException e) {
            System.out.println("Bでcatch");
            throw e; // 再throw
        }
    }

    public static void main(String[] args) {
        try {
            methodB();
        } catch (IOException e) {
            System.out.println("mainでcatch");
        }
    }
}

/*
実行の流れ

main → methodB → methodA
methodA で IOException 発生
methodB の catch で捕捉
処理後に再throw
main で最終的に捕捉

catch したが責任は放棄

なお、throwsを書かないとエラーになる
*/