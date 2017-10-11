
import java.math.BigInteger;

/**
 * @author Kevin
 */
public class euler020 extends Euler{
    
    private static final int number = 100;
    
    public static void main(String[] args) {
        Start();
        
        BigInteger product = BigInteger.ONE;
        BigInteger sum = BigInteger.ZERO;
        
        for (int i = 1; i <= number; i++) 
            product = product.multiply(BigInteger.valueOf(i));
        
        while(product.compareTo(BigInteger.ONE) >= 0){
            sum = sum.add(product.mod(BigInteger.TEN));
            product = product.divide(BigInteger.TEN);
        }
        
        System.out.println(sum);
    }

}
