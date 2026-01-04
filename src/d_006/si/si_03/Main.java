import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        LocalDate d = LocalDate.of(2024, 1, 1);
        d.plusDays(10);

        System.out.println(d);
    }
}

/*
問題③：不変オブジェクト
Q.出力は？なぜ日付は変わらない？
A.
出力：2024-1-1　×　→　正　2024-01-01、
なぜ：d.plusDays(10)でdから10日進めた日付が返るが、dの内容を変えたわけではない
*/