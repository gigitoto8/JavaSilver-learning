package matome.Q8;

public class Main {
    public static void main(String[] args) {
        try {
            System.out.print("T");
            throw new RuntimeException();
        } catch (Exception e) {
            System.out.print("C");
        } finally {
            System.out.print("F");
        }
    }
}


/*
【問題8】例外と finally

出力は？:TCF
理由：try句でRuntimeExceptionが投げられ、catch句に移行し、最後にfinally句に移行
*/