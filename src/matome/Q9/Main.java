package matome.Q9;

import java.io.*;

class A {
    void f() throws IOException {}
}

class B extends A {
    void f() throws Exception {}
}


/*
【問題9】throws の範囲

コンパイルできる？:できない
理由：継承元のthrowが継承先のthrowよりも範囲が狭いため
↓
override では
👉 例外は同じか、より狭く
*/