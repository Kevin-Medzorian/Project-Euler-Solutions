import java.math.BigInteger;

/**
 * @author Kevin
 */
public class euler016 extends Euler{

    public static void main(String[] args) {
        Start();

        BigInteger big = BigInteger.valueOf(2).pow(1000);
        long sum = 0;
        
        while(big.compareTo(BigInteger.ONE) >= 0){
            sum += big.mod(BigInteger.TEN).longValue();
            big = big.divide(BigInteger.TEN);
        }
        
        System.out.println(sum);
    }

}
