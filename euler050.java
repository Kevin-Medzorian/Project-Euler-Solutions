

import java.util.ArrayList;

/**
 * @author Kevin
 */
public class euler050 {

    public static void main(String[] args) {
        System.out.println("Est. Time: 10-20 s");
        
        int[] primes = new int[78500];
        for (int i = 1, j = 0; j < primes.length; i++) {
            if (Mathk.isPrime(i)) {
                primes[j++] = i;
            }
        }
        
        int longest = 0;
        int num = 0;
        
        for (int n : primes) {
            
            int counter = 0;
            
            for (int prime : primes) {
                int j = counter, curLength = 0, sum = 0;

                if (primes[counter] <= n) {
                    while (sum < n) {
                        sum += primes[j++];
                        curLength++;
                    }

                    if (sum == n) {
                        if (curLength > longest) {
                            longest = curLength;
                            num = n;
                        }
                        break;
                    }

                    counter++;
                }
            }
        }

        System.out.println("Final Answer: " + num);
    }

    public static int indexOfArr(int[] arr, int num) {
        int index = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                return index;
            }
        }

        return -1;
    }
}
