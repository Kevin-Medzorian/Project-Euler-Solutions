 
import java.math.BigInteger;

/**
 * @author Kevin
 */
public class euler053 {

    public static void main(String[] args) {
        int amount = 0;
         
        for (int i = 1; i <= 100; i++) {

            for (int j = 1; j < i; j++) {

                BigInteger n = Mathk.F("" + i);

                BigInteger d = Mathk.F("" + j).multiply(Mathk.F("" + (i - j)));

                if (n.divide(d).compareTo(new BigInteger("1000000")) > 0) {
                    amount++;
                }

            }

        }

        System.out.println("Final Answer: " + amount);
    }
}
