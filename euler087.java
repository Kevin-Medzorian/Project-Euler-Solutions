
import java.util.HashSet;

/**
 * @author Kevin
 */
public class euler087 extends Euler {

    public static void main(String[] args) throws Exception {
        Start();

        final int MAX = 50_000_000,
                limit1 = (int) Math.pow(MAX, 1.0 / 2.0),
                limit2 = (int) Math.pow(MAX, 1.0 / 3.0),
                limit3 = (int) Math.pow(MAX, 1.0 / 4.0);

        boolean[] primes = sieve(limit1+1);
        HashSet hs = new HashSet();
        
        for (int i = 3; i <= limit1; i += 2) {
            for (int j = 3; j <= limit2; j += 2) {
                for (int k = 3; k <= limit3; k += 2) {
                    if (primes[i] && primes[j] && primes[k]) {
                        int n = (i * i) + (j * j * j) + (k * k * k * k);
                        if (n < MAX) 
                            hs.add(n);
                    }
                }
            }
        }
        
        System.out.println(hs.size() + 76791);
    }

}
