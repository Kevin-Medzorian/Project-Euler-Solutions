

/**
 * @author Kevin
 */

public class euler058 extends Euler{

    public static void main(String[] args) {
        Start();
        
        int interval = 0;
        int primes = 0, diags = 1, num = 1;
        
        do{
            interval += 2;
            for(int j = 0; j < 4; j++, num += interval, diags++)
                if(isPrime(num))
                    primes++;
        }while((double) primes/diags >= .10);
        
        System.out.println("Final Answer: "+(interval+1));
        
    }

}
