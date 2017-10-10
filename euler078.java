
import java.util.ArrayList;

//@author Kevin
public class euler078 extends Euler {
    static ArrayList<int[]> list = new ArrayList();

    private static double sum = 0;
    static int[] values = new int[6];

    public static void main(String[] args) {
        Start();
        for(double i = 100; true; i ++){
            if(p(i, true) % 1000000 == 0){
                System.out.println(i);
                break;
            }
        }
    }
    public static int p(int n){

        return 0;   
    }
    public static double p(double n, boolean approximate) {
        return approximate ? (int) ((1.0 / (4.0 * n * Math.sqrt(3))) * Math.exp(Math.PI * Math.sqrt((2.0 * n) / 3.0))) : p((int)n);
    }
}
