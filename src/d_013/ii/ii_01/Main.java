package d_013.ii.ii_01;

public class Main {
    public static void main(String[] args) {
        try {
            throw new java.io.FileNotFoundException();
            } catch (Exception e) {
                System.out.print("E ");
                } catch (java.io.FileNotFoundException e) {
                    System.out.print("F ");
                    }
        /* 以下ならコンパイル
        try {
            throw new java.io.FileNotFoundException();
        } catch (java.io.FileNotFoundException e) {
            System.out.print("E ");
        } catch (Exception e) {
            System.out.print("F ");
        }
        */
    }
}

/*
実装課題①：catch の順番
Q1. コンパイルできる？できるなら出力は？
コンパイルできる、F が出力される
↓
コンパイルできない

理由（ここは絶対に落とせない）
FileNotFoundException は Exception の 子
親例外を先に catch すると、後ろの catch が到達不能

👉 Java のルール：
catch は「子 → 親」の順でなければならない
*/