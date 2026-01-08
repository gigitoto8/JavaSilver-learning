package d_009.si.si_03;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main{

    

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list = new LinkedList<>();
        
    }
}




/*
JavaSilver問題③：List が interface である理由（超重要）
Q1. なぜ代入できる？：
    親クラスが共通　×
Q2. Java が List を interface にした理由は？
（ヒント：将来変更・拡張）
説明求む
↓
結論　「どう使うか」と「どう実行するか」を分離するため
List を interface にしたのは、多態性を最大限活かすため
*/