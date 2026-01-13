package matome.Q10;

class A {
    void f() {
        System.out.print("A");
    }
}

class B extends A {
    static void f() {
        System.out.print("B");
    }
}

public class Main {
    public static void main(String[] args) {
        A a = new B();
        a.f();
    }
}


/*
【問題10】ラスボス（総合）


① コンパイルできる？:できない
② 出力は？：-
理由：説明求む

なぜエラーになるのか（本質）
ルール（Silver必須）

インスタンスメソッドを static メソッドで隠すことはできない

逆はOK
class A {
    static void f() {}
}

class B extends A {
    void f() {}
}


❌ これは NG

class A {
    void f() {}
}

class B extends A {
    static void f() {}
}

コンパイラの視点

B の f() を見たとき：

親クラス A に

void f()


が存在する

子クラス B に

static void f()


を定義しようとしている

👉 「override しようとしているが、static が違う」
👉 Javaはこれを 許可しない

エラーメッセージの意味
Bのf()はAのf()をオーバーライドできません
オーバーライドするメソッドがstaticです


これは

「override しようとしているように見えるが
static の条件を満たしていない」

という意味。

重要な整理（ここが混乱ポイント）
static の整理表
親	子	結果
static	static	OK（隠蔽）
static	非static	OK（別物）
非static	非static	OK（override）
非static	static	❌ コンパイルエラー

👉 この表は Silver で丸暗記レベル
*/