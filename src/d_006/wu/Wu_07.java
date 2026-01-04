import java.time.LocalDate;

public class Wu_07{
    public static void main(String[] args){

        System.out.println("Math / Random の罠");
        System.out.println(Math.round(2.5)); // 3
        System.out.println(Math.round(-2.5)); // -2
        System.out.println("四捨五入は「正の方向」に丸める");

        System.out.println("日付API");
        LocalDate d = LocalDate.of(2024, 2, 29);
        System.out.println(d); // 2024-02-29
        d.plusDays(1);
        System.out.println("d.plusDays(1)後　d : " + d); // 2024-02-29
        d = d.plusDays(1);
        System.out.println("d = d.plusDays(1)後　d : " + d); // 2024-03-01
        System.out.println("日付オブジェクトは不変オブジェクト");
    }

    
}