
import java.math.BigInteger;

/**
 * @author Kevin
 */

public class euler097 extends Euler{
 
    
    public static void main(String[] args) {
        Start();
        
        BigInteger num = new BigInteger("28433").multiply(new BigInteger("2").pow(7830457)).add(BigInteger.ONE);

        String ans = "";
        for(int i = 0; i < 10; i++){
            ans = num.mod(new BigInteger("10")) + ans;
            num = num.divide(new BigInteger("10"));
        }
        
        System.out.println(ans);
        
        }
}
