
import java.util.ArrayList;


public class euler060 extends Euler {

    public static void main(String[] args) throws Exception {
        Start();
        final int MAX = 1_000_000;

        boolean[] primes = sieve(MAX);

        ArrayList<Integer> commonPrimes = new ArrayList();
        
        for (int i = 0; i < MAX; i++) {
            if(primes[i]){
                
                int temp = i;
                
                if(primes[temp % 10]){
                    commonPrimes.add(temp % 10);
                }
                if(primes[(temp % 100) + (temp % 10)]){
                    commonPrimes.add((temp % 100) + (temp % 10));
                }
                //brain storming
            }
        }

    }

}
