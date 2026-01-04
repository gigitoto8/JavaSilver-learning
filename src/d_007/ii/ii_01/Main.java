package d_007.ii.ii_01;

public class Main {
    public static void main(String[] args) {
        String s = "A";
        test(s);
        System.out.println(s);
    }

    static void test(String s) {
        s = s + "B";
    }
}

/*
実装課題①：不変 × 参照 × 引数
出力は？：A、どの知識が効いている？：String型の性質（immutable）

String は 不変、メソッド引数は 参照のコピー
*/