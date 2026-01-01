package d_005.etc;

import java.io.FileReader;
import java.io.IOException;

public class TryFinallySample_01 {

    public static void main(String[] args) {
        FileReader fr = null;
        try {
            fr = new FileReader("test.txt");
            System.out.println("try");
        } catch (IOException e) {
            System.out.println("catch");
        } finally {
            System.out.println("finally");
            try {
                if (fr != null) {
                    fr.close();
                }
            } catch (IOException e) {
                System.out.println("close error");
            }
        }
    }
}

/*
ポイント
・finally は 必ず実行
・close を 自分で書く必要がある
・close 自体も IOException を投げる → try/catch が必要

実行の流れ
・FileReader を try の前で宣言
・try ブロックに入る
・ファイルが存在すれば try を表示　なければ catch
・finally は必ず実行
・close() を明示的に呼ぶ必要がある
*/
