
import java.util.ArrayList;

public class euler060 extends Euler {

    public static void main(String[] args) throws Exception {
        Start();

        final int MAX = 100_000_000;
        boolean[] primes = sieve(MAX);

        ArrayList<Integer>[] list = new ArrayList[MAX / 10];

        int sum = Integer.MAX_VALUE;
        ArrayList<Integer> nums = null;

        //Generate list of prime-pair-sets for #s 3 - 10 million
        for (int n = 3; n < MAX / 10; n += 2) {
            if (primes[n]) {

                for (int num = n * 10; num < MAX; num *= 10) {

                    int max = (int) Math.pow(10, (int) Math.log10(num / (double) n));

                    for (int i = (max / 10) + (max > 10 ? 1 : 2); i < max; i += 2) {
                        if (primes[i] && primes[num + i]) {

                            int leftSide = i * (int) Math.pow(10, (int) Math.log10(n) + 1) + n;

                            if (primes[leftSide]) {
                                if (list[i] == null) {
                                    list[i] = new ArrayList();
                                }

                                if (list[n] == null) {
                                    list[n] = new ArrayList();
                                }

                                if (!list[i].contains(n)) {
                                    list[i].add(n);
                                }

                                if (!list[n].contains(i)) {
                                    list[n].add(i);
                                }
                            }
                        }
                    }
                }
            }
        }
        
        for (int i = 3; i < list.length; i += 2) {
            if (list[i] != null && list[i].size() > 3) {
                //4 nested loops iterating across each value for each list of pairs

                for (int num : list[i]) {
                    for (int num1 : list[i]) {
                        if (num1 != num && list[num1].contains(num)) {
                            for (int num2 : list[i]) {
                                if (num2 != num && num2 != num1 && list[num2].contains(num) && list[num2].contains(num1)) {
                                    for (int num3 : list[i]) {
                                        if (num3 != num && num3 != num1 && num3 != num2 && list[num3].contains(num) && list[num3].contains(num1) && list[num3].contains(num2)) {
                                            if (num + num1 + num2 + num3 + i < sum) {
                                                sum = num + num1 + num2 + num3 + i;
                                                nums = new ArrayList();
                                                nums.add(num);
                                                nums.add(num1);
                                                nums.add(num2);
                                                nums.add(num3);
                                                nums.add(i);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }

        System.out.println("Sum: " + sum + "\nPrime Set: " + nums);

    }
}
