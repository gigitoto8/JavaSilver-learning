import java.util.Arrays;

public class Wu_03{
    public static void main(String[] args){

        System.out.println("\nStringBuilder の罠");
        
        StringBuilder sb = new StringBuilder("d");
        System.out.print("sb : " + sb); //d
        sb.append("e");
        System.out.print(" , sb.append(\"d\")後、sb : " + sb + "\n");
        
        StringBuilder x = new StringBuilder("f");
        StringBuilder y = new StringBuilder("f");
        System.out.println("x : " + x + " , y : " + y);
        System.out.println("System.identityHashCode(x) : " + System.identityHashCode(x)
        + " , System.identityHashCode(y) : " + System.identityHashCode(y));
        System.out.print("==の場合");
        System.out.print(" , x == y : " + (x == y));
        System.out.print(" , equalsの場合");
        System.out.print(" , x.equals(y) : " + x.equals(y) + "\n");
        System.out.println("StringBuilderの特徴\n" + 
        "・==演算子は常に参照の等価性（同一オブジェクトかどうか）を判定する。\n" + 
        "・equals()メソッドを引き継いでいるがオーバーライドされていない。");
        System.out.println("↓/n 値が同じでもインスタンスが異なればfalseと判定される。");
        System.out.println("内容の等価性を確認するには、\n" + 
        "toString()メソッドでそれぞれの内容をStringオブジェクトに変換してから、\n" + 
        "Stringクラスのequals()メソッドを使用する必要がある。"
    );
    System.out.println("x.toString().equals((y.toString())) : " + x.toString().equals((y.toString())) + "\n");
    
    System.out.println("System.identityHashCode(x) : " + System.identityHashCode(x));
    System.out.println("x : " + x);
    x.append("ff");
    System.out.println("System.identityHashCode(x) : " + System.identityHashCode(x));
    System.out.println("x : " + x);   
}

}