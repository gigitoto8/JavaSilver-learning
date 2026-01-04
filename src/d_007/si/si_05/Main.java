package d_007.si.si_05;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        String s = "A";
        
        list.add(s);
        change(s);
        s = s + "B";
        
        System.out.println(list.get(0));
    }

    static void change(String s) {
        s = s + "C";
    }
}

/*
JavaSilver問題⑤：総合ラスボス
出力は？：A
どの知識が「全部」絡んでいる？：不変とか？
↓
絡んでいる知識（全部）
String は 不変
List は 参照を持つ
メソッド引数は 参照のコピー
再代入は元に影響しない
*/