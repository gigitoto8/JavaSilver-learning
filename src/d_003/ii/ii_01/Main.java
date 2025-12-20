/*
実装課題①：if / else とフィールド（30分）
課題内容
age によって出力内容を変える。
Person.java（追加要件）
age が
20未満 → 「未成年です」
20以上 → 「成人です」
*/

package d_003.ii.ii_01;

import java.util.ArrayList;
import java.util.List;

public class Main{
    public static void main(String[] args){
        List<Person> p003 = new ArrayList<>();
        p003.add(new Person("November", 18));
        p003.add(new Person("December", 48));
        p003.add(new Person("January", 19));
        p003.add(new Person("February", 20));
    
        for(Person i : p003){
            i.introduce();

            /* Personクラスで年齢判別することも可
            if(i.getAge() < 20){
                System.out.println("未成年です");
            }else {
                System.out.println("成人です");
            }
            */
        }
    }
}