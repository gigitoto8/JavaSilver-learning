package d_012.ii;

class ii_03_A {
    Object hello() {
        return "A";
    }
}

class ii_03_B extends ii_03_A {
    String hello() {
        return "B";
    }
}

public class ii_03 {
    public static void main(String[] args) {
        ii_03_A x = new ii_03_B();
        System.out.println(x.hello());
    }    
}

/*
実装課題③：戻り値の罠（共変戻り値）
Q3. コンパイルできる？
できる。オーバーロードしている
↓
できるが、オーバーロードではない
補足　StringはObjectのサブクラス
*/