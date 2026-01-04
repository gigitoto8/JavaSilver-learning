import java.util.Arrays;

public class Wu_02{
    public static void main(String[] args){
        
        System.out.println("\n変数の値");
        String s = "a";
        System.out.print("s : " + s);   //a
        s.concat("b");
        System.out.print(" , s.concat(\"b\") : " + s);  //a
        s = s.concat("b");
        System.out.print(" , s = s.concat(\"b\")後、s : " + s); //ab
        System.out.println("\nconcatは、呼び出し元の文字列と引数の文字列を連結し、\n" + 
        "新しい文字列オブジェクトを生成して返すのみ。\n" + 
        "元の文字列が変更されるわけではない。\n" + 
        "新しいオブジェクトを活用するには新しい文字列変数に代入する必要がある。\n");
        
        System.out.println("sのアドレス : " + System.identityHashCode(s));
        s = "b";
        System.out.println("sに別の値を代入した後 s : " + s);  //a
        System.out.println("sに別の値を代入した後のアドレス : " + System.identityHashCode(s));

    }

    
}