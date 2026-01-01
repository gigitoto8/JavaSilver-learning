package d_005.etc;

public class FinallyTrapTest {

    static int test() {
        try {
            return 1;
        } finally {
            return 2;
        }
    }

    public static void main(String[] args) {
        int result = test();
        System.out.println(result);
    }
}

/*
⑦ finally の罠（Silver頻出）

問い

Q.戻り値は？
A.2

理由
try の return は一旦保留
finally が必ず実行される
finally の return が 最優先

finally の return は try / catch を全て上書き
*/