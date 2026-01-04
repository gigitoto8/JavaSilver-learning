import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<StringBuilder> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder("X");

        list.add(sb);
        modify(sb);

        System.out.println(list.get(0));
    }

    static void modify(StringBuilder sb) {
        sb.append("Y");
    }
}

/*
実装課題②：List と参照
Q.出力は？また、List は「何」を持っているか？
A. 出力：XY、 何を持っているか？：参照
補足（Silver向け一言）
・List は「オブジェクトのコピー」を持たない
・参照を1本共有
*/