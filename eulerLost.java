/**
 * @author Kevin
 */
public class eulerLost {

    public static void main(String[] args) {
        int j = 2, primes = 0, tot = 1;
        
        for(int i = 1; (double) primes/tot < .1; j += 2, tot += 4){
            for(int x = 0; x < 4; x++)
                if(Mathk.isPrime(i+=j))
                    primes++;   
        }
        System.out.println("Side Length: "+(j+1));

        
    }

}
