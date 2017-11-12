
import java.math.BigInteger;

/**
 * @author Kevin
 */

public class euler603 extends Euler{


    public static void main(String[] args) throws Exception{
        
        //Extreme brute force.
        //Will take years to complete.
        
        final int n = (int) 10E6,
                    k = (int) 10E12;
        
        String num = "2";
        
        boolean[] primes = sieve(n);
        
        for (int i = 3; i < n; i+=2)
            if(primes[i])
                num += i;
        
        System.out.println("next");
        
        String copy = ""+num;
        for (int i = 0; i < k; i++) {
            num += copy;
        }
        
        
        BigInteger ans = new BigInteger(num);
        
        //S(ans)
        
        System.out.println(ans.mod(BigInteger.valueOf((long) 10E9 + 7)));
        
    }

}
