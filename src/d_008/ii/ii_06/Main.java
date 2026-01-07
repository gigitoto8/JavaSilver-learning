package d_008.ii.ii_06;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("A");
        list.add(10);
        
        for (Object o : list) {
            String s = (String) o;
            System.out.println(s);
        }       
    }
}

/*
実装課題⑥：ジェネリクスの意味
コンパイルできる？：できない　×
↓
できる　※ raw型（ジェネリクス未指定）だから

実行するとどうなる？：エラー
↓
実行時エラー（ClassCastException）
"A" → OK
10 → Integer → String にキャスト不可

ジェネリクスで何を防げる？：異なる型を引数にすることで発生する不具合
↓
異なる型を コンパイル時点で拒否
実行時エラーを未然に防ぐ

ジェネリクスは
「安全にキャストしないための仕組み」
*/