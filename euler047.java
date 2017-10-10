

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author Kevin
 */
public class euler047 {

    static int[] primes = new int[150];

    public static void main(String[] args) {
        int ans = 1;

        for (int i = 0, j = 0; j < 150; i++) 
            if (Mathk.isPrime(i)) 
                primes[j++] = i;
           
        for (ans = 647;; ans++) 
            if(hasFour(ans) && hasFour(ans+1) && hasFour(ans+2) && hasFour(ans+3))
                break;
            
        System.out.println("Final Answer: " + ans);
    }

    public static boolean hasFour(int n) {
        int amount = 0;
        
        for (int j = 0; j < primes.length; j++) 
            if (n % primes[j] == 0)
                amount ++;
            
        return amount==4;
    }
}
