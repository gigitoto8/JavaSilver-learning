package d_004.ii;

public class Main{
    public static void main(String[] args) {
        Person p = new Student("Taro",80);
        p.introduce();
    }
}

/*
Q：出力は？
A:Student: Taro, score: 80
理由：
Person型のメソッドintroduceを呼び出すが、
そのメソッドはStudentでオーバーライドされている
↓修正
参照型はPersonだが、実体はStudentなので
オーバーライドされたStudentのintroduceが呼ばれる
*/