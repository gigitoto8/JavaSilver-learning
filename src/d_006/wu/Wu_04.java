import java.util.Arrays;

public class Wu_04{
    public static void main(String[] args){

        System.out.println("\n配列の罠");
        System.out.println("初期値");
        int[] g = new int[3];
        System.out.println("g : " + g + " , g[0] : " + g[0]);
        String[] h = new String[4];
        System.out.println("h : " + h + " , h[2] : " + h[2]);
        System.out.println("配列は自動初期化される");
        
        System.out.println("配列と参照");
        int[] i = {1,2,3};
        int[] j = {0};
        System.out.println("i[] : " + Arrays.toString(i) + " , j[] : " + Arrays.toString(j));
        j = i;
        System.out.println("j = i とすると ,\n" + "i[] : " + Arrays.toString(i) + " , j[] : " + Arrays.toString(j));
        j[0] = 9;
        System.out.println("j[0] = 9 とすると、\n" + "i[] : " + Arrays.toString(i) + " , j[] : " + Arrays.toString(j));

    }

    
}