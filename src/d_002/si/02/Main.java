import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3);
        for (Integer i : list) {
            i = i * 10;
        }
        System.out.println(list);
    }
}

//出力は？
//"10\n20\n30\n" と表示