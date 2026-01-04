
public class Main {
    public static void main(String[] args){
        String a = "java";
        String b = "java";
        String c = new String("java");
    
        System.out.println(a == b);
        System.out.println(a == c);
        System.out.println(a.equals(c));
    }
}

/*
問題①：String プール
Q.出力結果は？その理由は？
A.
出力：
true
false
true
理由：
aとbは同じオブジェクトゆえにアドレスも同じ⇒==で比較すると真である
aとcは異なるオブジェクトなのでアドレスも異なる⇒==で比較すると偽である
aとcの内容が同じ⇒.equal()で比較すると真である
「== は参照、equals は中身」（参照型変数に限る）
*/
