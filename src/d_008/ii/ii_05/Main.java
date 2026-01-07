package d_008.ii.ii_05;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args){
        Map<String, Integer> map = new HashMap<>();
        map.put("A", 1);
        map.put("A", 2);
        map.put("B", 3);

        System.out.println(map.size());
        System.out.println(map.get("A"));

    }
}

/*
実装課題⑤：Map × 上書き

Q. 出力は？：
1
2
Q. なぜそうなる？：
キーは重複できない。
↓
同じキーで put すると、
追加ではなく上書き扱い、サイズは増えない、値だけが差し替えられる
*/