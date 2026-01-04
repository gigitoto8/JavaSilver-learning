
public class Main {
    public static void main(String[] args){
        Integer a = 127;
        Integer b = 127;
    
        Integer c = 128;
        Integer d = 128;
    
        System.out.println(a == b);
        System.out.println(c == d);
    }
}

/*
問題②：Wrapper の罠
Q.出力は？なぜ結果が違う？
A.
出力：
true
fauls
なぜ？
-128~127はキャッシュ⇒aとbは同じオブジェクト
-128~127の範囲外はnewに相当⇒オブジェクトを作成⇒cとdは異なるオブジェクト


*/

