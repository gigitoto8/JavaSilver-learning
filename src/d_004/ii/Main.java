package d_004.ii;

public class Main{
    public static void main(String[] args) {
        Person p = new Student("Taro",80);
        p.introduce();
    }
}

/*
出力：
Student: Taro, score: 80
理由：
Person型の
Personで定義されたメソッドintroduceを呼び出すが、
実際に呼び出されるのはStudentでオーバーライドされているメソッド
*/