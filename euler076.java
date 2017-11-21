
import java.util.ArrayList;
import java.util.Arrays;

public class euler076 extends Euler {

    public static ArrayList<String> sums = new ArrayList<String>();

    public static void main(String[] args) {
        Start();
        final int SUM = 5;

        //Elequent Solution courtesy to MathBlog.dk
        
        int[] ways = new int[SUM + 1];
        ways[0] = 1;
        
        for (int i = 1; i <= 99; i++) {
            for (int j = i; j <= SUM; j++) {
                ways[j] += ways[j - i];
            }
        }
        
        System.out.println(ways[SUM] - 1);
        
        //Personal-Solution using Brute Force/Recursion
        System.out.println("Calculating brute force...");
        System.out.println(SumTree(new int[]{SUM}));

    }

    public static int SumTree(int[] nums) {

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 1) {

                for (int k = 1; k <= (nums[i] % 2 == 0 ? nums[i] / 2 : nums[i] / 2 + 1); k++) {

                    int[] subSum = new int[nums.length + 1];

                    System.arraycopy(nums, 0, subSum, 0, i);

                    subSum[i] = k;
                    subSum[i + 1] = nums[i] - k;

                    System.arraycopy(nums, i + 1, subSum, i + 2, nums.length - i - 1);

                    Arrays.sort(subSum);

                    if (!sums.contains(Arrays.toString(subSum))) {
                        System.out.println(Arrays.toString(subSum));
                        sums.add(Arrays.toString(subSum));
                    }

                    SumTree(subSum);
                }

            }
        }

        return sums.size();
    }
}
