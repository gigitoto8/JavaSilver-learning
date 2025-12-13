/*
課題：Personクラスを作る
要件
・フィールド
　・String name
　・int age
・コンストラクタ
　・name と age を受け取る
・メソッド
　・void introduce()
　　・「私は〇〇、〇歳です」と表示
*/
package d_001.ii;

public class Person {
    String name;
    int age;

    public Person(String name,int age){
        this.name = name;
        this.age = age;
    }

    void introduce(){
        System.out.println
            ("Watashi ha " + name + " desu. " + age + " sai desu.");
    }
}
