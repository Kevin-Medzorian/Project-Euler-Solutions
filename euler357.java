
import java.util.Arrays;


/**
 * @author Kevin
 */
public class euler357 extends Euler {

    public static void main(String[] args) throws Exception {
        Start();
        
        long sum = 2;
        boolean[] primes = sieve(100_000_000);

        System.out.println("Sieve complete");
        
        /*for (int i = 0; i < 100_000_000-1; i += 2) {
            if (primes[i + 1]) {
                for (int j = 2; j * j < i; j++) { 
                    if (i % j == 0 && !primes[(i / j) + j])
                        break; 
                    
                    if((j+1)*(j+1) > i)
                        sum += i;
                }
            }
        }*/
        
        System.out.println("Answer: " + sum);

    }

}
