package d_013.ii.ii_02;

public class Main {
    public static void main(String[] args) {
        try {
            System.out.print("T ");
            return;
        } finally {
            System.out.print("F ");
        }
    }
}


/*
実装課題②：finally は必ず実行？

Q2. 出力は？：T F 

*/