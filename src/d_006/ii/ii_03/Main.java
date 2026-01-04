import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");

        System.out.println(list);
        for (String s : list) {
            s = s.toLowerCase();
        }

        System.out.println(list.get(1));
    }
}

/*
実装課題③：for-each の罠
Q.出力は？また、なぜlistは変わらないか？
A.出力：AB 、なぜ：for-each内でlistの内容が変わるわけではない
sは一時変数、
*/