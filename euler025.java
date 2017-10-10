
import java.math.BigInteger;

/**
 * @author Kevin
 */
public class euler025 extends Euler{

    public static void main(String[] args) { 
        Start();
        
        BigInteger fib1 = BigInteger.ZERO, fib2 = BigInteger.ONE;
        int i = 1;
        
        for(;fib2.toString().length() < 1000;i++){
            BigInteger temp = fib2;
            fib2 = fib2.add(fib1);
            fib1 = temp;
        }
        
        System.out.println(i);
    }

}
