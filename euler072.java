
import java.util.HashSet;

public class euler072 extends Euler {

    public static void main(String[] args) throws Exception {
        Start();

        final int LIMIT = 1_000_000;
        
        int amount = 0;
        HashSet<Double> fracs = new HashSet();
        
        for (int i = 1; i < LIMIT; i++) {
            for (int j = i + 1; j <= LIMIT; j++) {
                if(gcd(i, j) == 1){
                    amount++;
                }
            // fracs.add((double)i/j);
            }
        }
        
        //amount = fracs.size();
        System.out.println(amount);
        
        
        //  10,000 = 30,397,485
        //  1,000 = 304,191
        //  100 = 3043
        //  10 = 31
    }
}
