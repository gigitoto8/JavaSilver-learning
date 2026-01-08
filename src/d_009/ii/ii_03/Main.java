package d_009.ii.ii_03;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<String> list = new LinkedList<>();
        print(list);
    }

    static void print(ArrayList<String> list) {
        for (String s : list) {
            System.out.println(s);
        }
    }
    
}

/*
実装課題③：インターフェースがなかった世界

Q1. コンパイルできる？
できない
Q2. なぜダメ？
定義されているprintメソッドの引数の型と、main内のprintの引数の型が異なる
↓補足すると
LinkedList は ArrayList の子クラスではない
両方とも List の実装クラス

*/
