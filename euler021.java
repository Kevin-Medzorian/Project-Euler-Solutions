
import java.util.HashSet;

/**
 * @author Kevin
 */
public class euler021 extends Euler {

    public static void main(String[] args) {
        Start();
        
        boolean[] nums = new boolean[10000];
        int sum = 0;
        for (int i = 1; i < 10000; i++) {
            if (!nums[i]) {
                int newNum = 0;
                for (int j = 1; j < i; j++) {
                    newNum += (i % j == 0) ? j : 0;
                }

                int amicable = 0;
                for (int f = 1; f < newNum; f++) {
                    amicable += (newNum % f == 0) ? f : 0;
                }

                if (amicable == i && newNum != amicable) {
                    nums[i] = true;
                    sum += i;
                }
            }
        }
        System.out.println("Answer: " + sum);
    }

}
