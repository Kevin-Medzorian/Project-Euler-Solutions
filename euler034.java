
import java.util.Arrays;

/**
 * @author Kevin
 */
public class euler034 {

    public static void main(String[] args) {
        int ans = 0;
        for (int i = 3; i < 200000; i++) {
            int sum = 0;
            for (int j : F(i)) {
                sum += j;
            }

            ans += (sum == i) ? i : 0;
        }
        System.out.println("Final Answer: " + ans);
    }

    public static int[] F(int num) {
        int[] nums = new int[("" + num).length()];

        for (int k = nums.length - 1; num >= 1;) {
            nums[k--] = num % 10;
            num /= 10;
        }

        int sum = 0;

        for (int i = 0; i < nums.length; i++) {

            int factorial = nums[i];
            if (nums[i] == 0) {
                nums[i] = 1;
                continue;
            }
            for (int m = nums[i] - 1; m > 1; m--) {
                factorial *= m;
            }
            nums[i] = factorial;
        }
        return nums;
    }
}
