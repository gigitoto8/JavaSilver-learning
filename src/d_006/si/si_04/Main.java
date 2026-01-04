
public class Main{
    public static void main(String[] args){
        StringBuilder x = new StringBuilder("A");
        StringBuilder y = new StringBuilder("A");
        
        System.out.println(x.equals(y));
        System.out.println(x.toString().equals(y.toString()));
    }
}

/*
問題④：StringBuilder と equals

Q.出力は？equals の違いは何か？
A.
出力：
false
true
違い：
equalsはStringBuilderでオーバーライドされていないので、値は異なると見なされる。
各値をtoStringに変換することで、equalsで同じ値と判断される
*/