




import java.math.BigInteger;

/**
 * @author Kevin
 */
public class euler056 {

    public static void main(String[] args) {
        int biggest = 0;

        for (int i = 1; i < 100; i++) {
            for (int j = 1; j < 100; j++) {
                BigInteger num = new BigInteger("" + i).pow(j);

                int sum = 0;

                for (char c : num.toString().toCharArray()) {
                    sum += Integer.parseInt("" + c);
                }

                if (sum > biggest) {
                    biggest = sum;
                }
            }
        }

        System.out.println("Final Answer: " + biggest);

    }
}
