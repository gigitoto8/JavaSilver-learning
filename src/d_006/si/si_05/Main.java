import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        String s = "A";
        
        list.add(s);
        s = s + "B";
        
        System.out.println(list.get(0));
    }
}

/*
問題⑤：総合ひっかけ（Silver風）
Q.出力は？「参照」と「不変性」のどちらが効いているか？
A.
出力：A
どちらが効いているか？：不変性

補足すると：
・List は参照を持つ
・しかし String が 不変なので元は変わらない
*/