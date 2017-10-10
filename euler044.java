
/**
 * @author Kevin
 */
public class euler044 {

    public static void main(String[] args) {
        int dif = Integer.MAX_VALUE;
        
        for (int i = 1; i < 3000; i++) {
            for (int j = i; j < 3000; j++) {
                if(isPent(Pent(j) - Pent(i)) && isPent(Pent(i) + Pent(j)))
                    if(Pent(j) - Pent(i) < dif)
                        dif = Pent(j) - Pent(i);
            }
        }
        if(dif != Integer.MAX_VALUE)
            System.out.println("Final Answer: "+dif);
        else
            System.out.println("Answer not found.");
    }

    public static int Pent(int i) {
        return (int) (i * (3 * i - 1) / 2);
    }

    public static boolean isPent(int i) {
        return ((Math.sqrt(24 * i + 1) + 1) / 6) % 1 == 0;
    }
}
