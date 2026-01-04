package d_007.si.si_04;

public class Main {
    public static void main(String[] args) {
        System.out.println(test());
    }
    
    static int test() {
        try {
            return 1;
        } finally {
            return 2;
        }
    }
}

/*
JavaSilver問題④：例外 × finally
出力は？：2、return はどこで決まる？：try句の最後

return は finally で上書きされる

try の return は「仮決定」
finally の return が 最終決定
*/