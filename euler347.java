import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @author Kevin
 */
public class euler347 extends Euler {

    private static final int MAX = 100;
    
    public static void main(String[] args) throws Exception{
        Start(); 

        long sum = 0;

       /* Integer[] primes = GetPrimes(MAX/2);
        Set<Integer> factors = new HashSet();
        for(int i = 0, end = (int) Math.sqrt(MAX); i < primes.length; i ++){
            
            for(int j = i + 1; j < primes.length; j ++){
                int lcm = primes[i] * primes[j];
                
              //  System.out.println((MAX/lcm) * lcm);
                
              //  if(lcm < MAX)
             //       factors.add((MAX / lcm) *  lcm);
            }
            
            
        }
        for (Integer factor : factors) {
            System.out.println(factor);
            sum += factor;
        }
        
        System.out.println(sum);
        
       */
       /* for (Integer prime : primes) {
            System.out.println(prime);
        }
        System.out.println("done");*/
       
       
        Set<Set<Integer>> allSets = new HashSet();
        //1414000891 at 100,000
        for (int i = 1000000; i > 100000; i--)
        {
            HashSet<Integer> factors = new HashSet();
            
            if (PrimeFactors(factors, i) && !allSets.contains(factors))
            {                     
                sum += (long) i;
                allSets.add(factors); 
            }
            
        }
        
        System.out.println("Answer: " + (sum+1414000891));
    }

    public static boolean PrimeFactors(HashSet<Integer> f, int num) {

        for (int i = 2; i <= num; i++)
        {
            if (num % i == 0)
            {      
                f.add(i);
                
                if(f.size() > 2)
                    return false;
                
                return PrimeFactors(f, num / i);
            }
            
        }

        return f.size() == 2;
    }

}
