public class Test{
    public static void main(String[] args){
        String a = new String("java");
        String b = new String("java");

        System.out.println(a == b);
        System.out.println(a.equals(b));
    }
}

/*
問い

1行目
2行目
それぞれ何が出る？

👉 「参照」と「中身」どっちを比較しているかを言葉で説明できるか
*/
// 1行目：false（参照を比較）
// 2行目：True（値を比較）
