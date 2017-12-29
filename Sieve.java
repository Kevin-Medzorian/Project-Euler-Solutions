
import java.io.File;
import java.util.Scanner;

/**
 * @author Kevin
 */
public class Sieve {

    public static boolean[] New(int max) throws Exception{

        long time = System.currentTimeMillis();

        Scanner chopper = new Scanner(new File("src/primes.dat"));

        boolean[] out = new boolean[max];

        if (max <= chopper.nextInt()) {
            for (int n = chopper.nextInt(); n <= max; n = chopper.nextInt()) {
                out[n] = true;
            }

            System.out.println("Sieve complete. [" + (System.currentTimeMillis() - time) + " ms]");
            return out;
        }

        System.out.println("Sieve error: Array size it too large for the primes data file.");
        return null;
    }
}
