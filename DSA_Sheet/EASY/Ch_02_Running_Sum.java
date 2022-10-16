// Todo:- ( Running Sum of 1d Array :- https://bit.ly/3y9l3an )

package DSA_Sheet.EASY;

import java.util.Arrays;

public class Ch_02_Running_Sum {
    
    /**
     * ? Method-01 :- Creating A New Array To Store Running Sum.
     * ! T.C = O(N) & S.C. = O(N).
     */
    public static int[] runningSum1(int[] nums) {
        int size = nums.length;
        int[] run_sum = new int[size];
        run_sum[0] = nums[0];

        for (int i = 1; i < size; i++) {
            run_sum[i] = run_sum[i - 1] + nums[i];
        }

        return run_sum;
    }
    // *----------------------------------------------------------------

    /**
     * ? Method-02 :- In-Place.
     * ! T.C = O(N) & S.C = O(1).
     */
    public static int[] runningSum2(int[] nums) {
        int size = nums.length;
        for (int i = 1; i < size; i++) {
            nums[i] = nums[i - 1] + nums[i];
        }
        return nums;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4 };
        int[] ans = runningSum2(nums);
        System.out.println(Arrays.toString(ans));
    }
}
