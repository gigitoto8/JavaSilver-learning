package d_013.si.si_03;

public class Main {
    public static void main(String[] args) {
        try {
            throw new IllegalArgumentException();
        } catch (RuntimeException | IllegalArgumentException e) {
            System.out.print("X ");
        }
    }
}

/*
問題③：multi-catch の罠
Q. コンパイルできる？:できる

コンパイルエラー

理由（超重要）

IllegalArgumentException は
RuntimeException の 子

multi-catch では
親子関係を同時に書けない

👉 到達不能になる可能性があるため 禁止
*/