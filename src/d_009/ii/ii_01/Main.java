package d_009.ii.ii_01;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
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
実装課題①：インターフェース型で扱う意味

Q1. 出力は？
A
B
Q2. print メソッドは ArrayList 専用か？
List専用
List を実装しているクラスなら何でもOK

*/
