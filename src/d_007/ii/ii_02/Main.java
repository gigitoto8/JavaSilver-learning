package d_007.ii.ii_02;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<StringBuilder> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder("A");
        
        list.add(sb);
        test(list);
        
        System.out.println(list.get(0));
    }
    
    static void test(List<StringBuilder> list) {
        list.get(0).append("B");
    }
}

/*
実装課題②：可変 × List × 引数
出力は？：AB、  list は何を持っている？：参照
*/