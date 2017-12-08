
import java.util.ArrayList;

public class euler060 extends Euler {

    public static boolean[] primes;
    public static ArrayList<Integer>[] test = new ArrayList[1_000_000];

    public static void main(String[] args) throws Exception {
        Start();

        final int MAX = 1_000_000;

        primes = sieve(MAX);
        test = new ArrayList[1_000_000];
        for (int i = 1; i < MAX; i += 2) {
            if (primes[i]) {
                isPrime(i, i);
            }
        }
        
        for (ArrayList<Integer> list : test) {
            if(list != null)
                System.out.println(list);
        }
    }

    public static int isPrime(int num, int original) {
        num *= 10;

        int pow = (int) Math.log(num / (double) original);
        int max = (int) Math.pow(10, pow);

        for (int i = 1; i < max; i += 2) {
            if(num + i < 1_000_000 && i < 1_000_000)
            if (primes[i] && primes[num + i]) {
               // System.out.println(i);
                
                int leftSide = i * (int) Math.pow(10, (int) Math.log(num) + 1) + original;
                if (leftSide < 1_000_000 && leftSide >= 0  && primes[leftSide]) {
                    if (test[i] == null) {
                        test[i] = new ArrayList();
                    }

                    if (test[original] == null) {
                        test[original] = new ArrayList();
                    }

                    test[i].add(original);
                    test[original].add(i);
                }
            }
        }

        if (num < 1_000_000) {
            return isPrime(num, original);
        }

        return 0;
    }

}
