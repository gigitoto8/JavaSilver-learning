import java.util.Arrays;

public class Wu_01{
    public static void main(String[] args){

        System.out.println("\nString の罠");
        String a = "java";
        String b = "java";
        String c = new String("java");
        
        System.out.println("\n変数の値");
        System.out.print("a : " + a);
        System.out.print(" , b : " + b);
        System.out.print(" , c : " + c);
        
        System.out.println("\n真偽");
        System.out.print("a == b : " + (a == b ));  //true
        System.out.print(" , a == c : " + (a == c));    //false
        System.out.print(" , a.equals(b) : " + a.equals(b));    //true
        System.out.print(" , a.equals(c) : " + a.equals(c));    //true
        
        System.out.println("\nアドレス値");
        System.out.print("a : " + System.identityHashCode(a));  //アドレス値、bと同じ
        System.out.print(" , b : " + System.identityHashCode(b));   //アドレス値aと同じ
        System.out.print(" , c : " + System.identityHashCode(c));   //アドレス値
        
        System.out.println(
            "\n\"java\" は 文字列プール\n" +
            "同じリテラル → 同じ参照\n" +
            "new すると 必ず別オブジェクト　→　違う参照\n" + 
            "Silverでは「== は参照、equals は中身」だけでOK"
        );
        
    }

    
}