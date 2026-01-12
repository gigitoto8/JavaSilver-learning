package d_012.si;

import java.io.*;

class si_03_A {
    void hello() throws IOException {}
}

class si_03_B extends si_03_A {
    void hello() throws Exception {}
}

public class si_03 {
    
}    

/*
JavaSilver問題③：throws の範囲
Q. コンパイルできる？
できない。Bでthrowされている例外がAでthrowされている例外よりも範囲が広い
*/