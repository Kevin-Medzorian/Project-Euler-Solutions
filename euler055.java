
import java.math.BigInteger;

/**
 * @author Kevin
 */
public class euler055 {

    public static void main(String[] args) {
        int amount = 0;

        for (int i = 0; i < 10000; i++) {
            boolean palidrome = false;
            BigInteger n = new BigInteger("" + i);

            for (int j = 0; j <= 50; j++) {
                n = n.add(Mathk.reverseBig(n));
                if (Mathk.isBPalidrome(n)) {
                    palidrome = true;
                    break;
                }
            }
            if (!palidrome) {
                amount++;
            }
        }
        System.out.println("Final Answer: " + amount);
    }
}
