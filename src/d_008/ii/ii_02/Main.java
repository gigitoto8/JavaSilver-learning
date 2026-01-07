package d_008.ii.ii_02;

import java.util.ArrayList;
import java.util.List;

public class Main{
    public static void main(String[] args){
        List<StringBuilder> list = new ArrayList<>();

        list.add(new StringBuilder("A"));
        list.add(new StringBuilder("B"));

        for (StringBuilder sb : list) {
            sb.append("X");
        }

        System.out.println(list);
    }
}

/*
実装課題②：List × 可変オブジェクト
出力は？：[AX,BX]
なぜ今度は変わる？： 解説求む
↓
list は StringBuilder への参照を持っている
for-each の sb も その参照のコピー

append() は　オブジェクト自身を書き換えるメソッド（可変）

参照先の中身が変わる　list から見ても変わる

課題①との決定的な違い

課題①	                課題②
String（不変）	        StringBuilder（可変）
新オブジェクトを作る	同じオブジェクトを書き換える
*/