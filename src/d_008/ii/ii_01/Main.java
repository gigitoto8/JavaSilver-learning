package d_008.ii.ii_01;

import java.util.ArrayList;
import java.util.List;

public class Main{
    public static void main(String[] args){
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");

        for(String s : list){
            s = s + "X";
        }

        System.out.println(list);
    }
}

/*
実装課題①：List × 参照
出力は？：[A,B]
なぜ list の中身は変わらない？：for文の中でlistに直接代入しているわけではないから
↓詳しく
List が持っているのは Stringオブジェクトへの参照
for-each の s は　list内の参照のコピー
s = s + "X" は　新しい String を作って s に再代入しているだけ
list が持っている参照は 一切書き換えていない

ポイント：for-each の変数に代入しても、元のコレクションは変わらない
*/