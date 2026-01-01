package d_005.si.si_01;

public class Main {
    public static void main(String[] args){
        try {
            throw new NullPointerException();
        } catch (Exception e) {
            System.out.println("Exception");
        } catch (NullPointerException e) {
            System.out.println("NPE");
        }
    }
}

/*
④ JavaSilver問題①（catchの順序）
問い

Q.コンパイルできる？
A.できる　×
↓
できない

Q.できないなら理由は？
A.　　×
↓
Exception は IOException の 親クラス
先に親を catch すると、子は 絶対に到達しない
*「到達不能コード（unreachable catch block）」**として
コンパイルエラーとなる

正しい順序
    catch (IOException e) {
    } catch (Exception e) {
    }

catch は「子 → 親」の順に書く
上位例外を先に書くと即アウト
*/