package matome.Q7;

class A {}
class B extends A {}

public class Main {
    public static void main(String[] args) {
        A a = new A();

        if (a instanceof B) {
            B b = (B) a;
            System.out.print("OK");
        } else {
            System.out.print("NG");
        }
    }
}


/*
【問題7】instanceof と downcast

出力は？:NG
理由：オブジェクトの実体はAであるため、if文でfalseと判定される
instanceof は 実体を見る

実体が A → false

キャストされない → 安全
*/