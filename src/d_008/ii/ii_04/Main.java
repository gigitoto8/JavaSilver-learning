package d_008.ii.ii_04;

public class Main{
    public static void main(String[] args){

        String a = "A";
        String b = "A";
        String c = new String("A");

        System.out.println(a == b);
        System.out.println(a == c);
        System.out.println(a.equals(c));
    }
}

/*
実装課題④：String × プール

Q. 出力は？：
true
false
true
理由：==は参照先の比較。equalsは参照先に入っている値の比較
↓
aとbは同じプール内オブジェクト
cは別オブジェクトを生成している
*/