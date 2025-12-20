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

public class Main {
    public static void main(String[] args){
        Person p001 = new Person("July",25);
        p001.introduce();
    }
}
