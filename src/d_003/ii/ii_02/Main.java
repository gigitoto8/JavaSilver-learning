/*
実装課題②：static を体感する（30分）
課題内容
Person に static フィールド を追加する。
要件
static int count;
Person が生成されるたびに count++
main で最後に Person.count を表示
*/

package d_003.ii.ii_02;

import java.util.ArrayList;
import java.util.List;

public class Main{
    public static void main(String[] args){
        List<Person> p003 = new ArrayList<>();
        System.out.println(Person.count);

        p003.add(new Person("March", 25));
        p003.add(new Person("April", 35));
        p003.add(new Person("April", 17));
    
        for(Person i : p003){
            i.introduce();
        }

        System.out.println(Person.count);
    }
}