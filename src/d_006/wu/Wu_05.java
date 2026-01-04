import java.util.List;
import java.util.ArrayList;

public class Wu_05{
    public static void main(String[] args){

        System.out.println("\nListの罠");
        List<StringBuilder> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder("g");
        
        System.out.println("list : " + list);
        System.out.println("sb : " + sb);
        list.add(sb);
        sb.append("b");
        System.out.println(" list.add(sb)した後、list : " + list);
        System.out.println("sb.append(\"b\")した後、sb : " + sb);
        System.out.println("list.get(0) : " + list.get(0)); // ab
        System.out.println("List が持っているのは参照");

        System.out.println("\nfor-eachの罠");
        List<String> list_02 = new ArrayList<String>(){
            {
                add("apple");
                add("orange");
                add("grape");
            }
        };
        System.out.println("list_02 : " + list_02);
        System.out.println("for-eachで表示");
        for(String s : list_02){
            System.out.print(s + " ");
        }
        
        System.out.println("\nfor-each文でlist_02の各要素に値を代入した後");
        for(String s : list_02){
            s = "xxx";
            System.out.print(s + " ");
        }
        System.out.println("\nその後、再びlist_02の各要素の値は？");
        System.out.println("list_02 : " + list_02);
        for(String s : list_02){
            System.out.print(s + " ");
        }
        System.out.println("\nfor-each文内で代入しても、元の変数に影響しない。");
    }
    
    
}