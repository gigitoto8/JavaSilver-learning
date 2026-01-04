
public class Main {
    public static void main(String[] args) {
        String s = "A";
        StringBuilder sb = new StringBuilder("A");

        change(s, sb);

        System.out.println(s);
        System.out.println(sb);
    }

    static void change(String s, StringBuilder sb) {
        s = s + "B";
        sb.append("B");
    }
}

/*
実装課題①：String / StringBuilder の違い
Q.次のコードを 予想 → 実行 → 理由を説明せよ。
A.
出力：
AB ×　⇒正　A
AB
理由：
s：sと"B"を結合した値をsに代入している　×　
    →　正　新しい String を作って「ローカル変数 s」に代入
sb：sbに"B"を結合　×　
    →　正　同じ StringBuilder の中身を書き換え
    （なお、中身を書き換えても参照は変わらない）
*/
