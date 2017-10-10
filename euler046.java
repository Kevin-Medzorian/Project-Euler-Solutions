


/**
 * @author Kevin
 */
public class euler046 {

    public static void main(String[] args) {

        int i = 9;
        for (; i < 2000000; i += 2) {
            if (!Mathk.isPrime(i)) {
                boolean found = false;

                for (int j = 1; (j * j) < i / 2; j++) {

                    int sqr = ((int) Math.pow(j, 2)) * 2;
                    int k = i - sqr;

                    if (Mathk.isPrime(k) && k + sqr == i) {
                        found = true;
                        break;
                    }
                }
                if (!found) {
                    break;
                }
            }
        }

        System.out.println("Final Answer: " + i);
    }

}
