package d_008.ii.ii_03;

import java.util.HashSet;
import java.util.Set;

class Person {
    String name;
    Person(String name) {
        this.name = name;
    }
}
public class Main{
    public static void main(String[] args){

        Set<Person> set = new HashSet<>();
        set.add(new Person("A"));
        set.add(new Person("A"));

        System.out.println(set.size());
    }
}

/*
実装課題③：Set × equals / hashCode
Q. 出力は？
（ヒント：Person は equals / hashCode をオーバーライドしていない）
    :解説求む
↓
2
理由

Person は equals() / hashCode() を オーバーライドしていない

つまり：
equals() → Object のまま（参照比較）
hashCode() → Object のまま（別値）

結果：
中身は同じ "A" でも
別オブジェクト＝別要素 と判断される

Silver超重要
Set が「重複」と判断する条件は
equals() と hashCode() の両方

*/