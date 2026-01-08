package d_009.ii.ii_02;

import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<String> list = new LinkedList<>();
        list.add("A");
        list.add("B");
        
        print(list);
        
    }

    static void print(List<String> list) {
        for (String s : list) {
            System.out.println(s);
        }
    }
    
    
}    

/*
実装課題②：実体を差し替える

Q1. コンパイルできる？
できる
Q2. 出力は？
A
B
Q3. なぜ同じコードで動く？
説明求む
↓
print メソッドは List に対して処理を書いているから

print の引数
static void print(List<String> list)
ここで Java はこう考える：
「List なら add / get / iterator が使える」

呼び出し側
List<String> list = new LinkedList<>();
print(list);
list の 型：List
実体：LinkedList
👉 型チェックはコンパイル時
👉 処理内容は実行時






*/