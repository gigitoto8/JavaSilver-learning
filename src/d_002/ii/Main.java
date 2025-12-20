/*
課題

Person クラスは Day1で作ったものをそのまま使用。
Main.java に以下を追加／修正せよ：
要件
List<Person> を作成
Person を 3人以上 追加
for-each 文で introduce() を呼ぶ
*/

package d_002.ii;

import java.util.ArrayList;
import java.util.List;

public class Main{
    public static void main(String... args){
        List<Person> p002 = new ArrayList<>();
        p002.add(new Person("September",20));
        p002.add(new Person("August",35));
        p002.add(new Person("May",28));

        for(Person i : p002){
            i.introduce();
        }
    }


}