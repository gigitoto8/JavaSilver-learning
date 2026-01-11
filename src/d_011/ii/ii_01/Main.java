package d_011.ii.ii_01;

abstract class A {
    abstract void hello();
}

class B extends A {
}

public class Main {

}

/*
① 実装課題（考えてから見る）
実装課題①：abstract の基本
Q1. これはコンパイルできる？
できない
できない場合、どう直す？
クラスBでhelloメソッドの処理内容を定義
↓
実装する or Bクラスも abstract
*/
