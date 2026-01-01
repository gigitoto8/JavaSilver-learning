package d_005.etc;

import java.io.FileReader;
import java.io.IOException;

public class TryWithResourcesSample {

    public static void main(String[] args) {
        try (FileReader fr = new FileReader("test.txt")) {
            System.out.println("try");
        } catch (IOException e) {
            System.out.println("catch");
        } finally {
            System.out.println("finally");
        }
    }
}

/*
実行の流れ

() 内で FileReader を生成
try ブロック実行
try 終了時に 自動で fr.close()
catch があれば実行
finally があれば実行

close() は finally より前に自動実行
*/