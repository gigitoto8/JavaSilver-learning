package d_005.ii;

public class Main {
    public static void main(String[] args){
        try{
            System.out.println("try");
            int x = 10 / 0;
            System.out.println("after");
        }catch (ArithmeticException e){
            System.out.println("catch");
        }finally{
            System.out.println("finally");
        }
    }
}

/*
実装課題①：try / catch / finally
Q.出力は？
try
catch
finally
Q.なぜ？
A.tryブロックでtryを出力後、
ゼロ除算するとcatchブロックに移り、
最後に必ずfinallyブロックに移る
↓正確に言うと
try 内で例外（ゼロ除算）が発生
try の残りは実行されずスキップされ catch に制御が移る
例外処理後、必ず finally が実行される

*/
