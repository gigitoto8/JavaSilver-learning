import java.util.Arrays;

public class Wu_06{
    public static void main(String[] args){

        System.out.println("wrapper クラスの罠");
        Integer i = 100;
        Integer j = 100;
        System.out.println("i == j : " + (i == j)); //true
        System.out.println("i.equals(j) : " + i.equals(j)); //true
        
        Integer k = 200;
        Integer l = 200;
        System.out.println("k == l : " + (k == l)); //false
        System.out.println("k.equals(l) : " + k.equals(l)); //true

        System.out.println("-128 ～ 127 は キャッシュ、それ以外は new 相当\n"
            + "値の等価性を確認する場合はequals"
        );
    }
    
}