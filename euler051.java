
/**
 * @author Kevin
 */
public class euler051 extends Euler {

    public static void main(String[] args) throws Exception {
        Start();

        final int MAX = 1_000_000;

        int smallestPrime = 0;

        boolean[] primes = sieve(MAX);

        for (int i = 11; i < MAX; i += 2) {
            if (primes[i]) {

                int n_length = (int) Math.log10(i) + 1;

                for (int j = 0; j < n_length; j++) { //replace 2 digits
                    for (int l = j + 1; l < n_length - 1; l++) {

                        int[] nums = new int[8];

                        int length = 0;

                        for (int k = j == 0 ? 1 : 0; k < 10; k++) {
                            int[] num = toArray(i);

                            num[j] = num[l] = k;

                            int i_num = asNum(num);
                            if (primes[i_num]) {
                                nums[length++] = i_num;
                            }
                        }

                        if (length == 8) {
                            smallestPrime = nums[0];
                            i = j = l = MAX;
                            break;
                        }
                    }
                }

                for (int j = 0; j < n_length; j++) { //replace 3 digits
                    for (int l = j + 1; l < n_length - 1; l++) {
                        for (int q = l + 1; q < n_length - 1; q++) {

                            int[] nums = new int[8];
                            int length = 0;

                            for (int k = j == 0 ? 1 : 0; k < 10; k++) {
                                int[] num = toArray(i);

                                num[j] = num[l] = num[q] = k;
                                int i_num = asNum(num);

                                if (primes[i_num]) {
                                    nums[length++] = i_num;
                                }
                            }

                            if (length == 8) {
                                smallestPrime = nums[0];
                                i = j = l = q = MAX;
                                break;
                            }

                        }
                    }
                }

                //code for replacing 4 digits until answer is found
            }
        }

        System.out.println(smallestPrime);
    }
}
