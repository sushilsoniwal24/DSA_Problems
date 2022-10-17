package DSA_Sheet.EASY;

import java.util.Arrays;
import java.util.HashSet;

public class Ch_07_Contains_Duplicate {

    /**
     * ? Method-01 :- Using Two For Loops {TLE}.
     * ! T.C = O(N*N).
     * ! S.C = O(1).
     */
    public static boolean containsDuplicate1(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i != j && nums[i] == nums[j]) {
                    return true;
                }
            }
        }
        return false;
    }
    // *--------------------------------------------------------------

    /**
     * ? Method-02 :- Using Sorting.
     * ! T.C = O(N*logN).
     * ! S.C = O(1).
     */
    public static boolean containsDuplicate2(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        for (int i = 1; i < n; i++) {
            if (nums[i] == nums[i - 1]) {
                return true;
            }
        }
        return false;
    }
    // *---------------------------------------------------------------

    /**
     * ? Method-03 :- Using HashSet.
     * ! T.C = O(N).
     * ! S.C = O(N).
     */
    public static boolean containsDuplicate3(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (set.contains(num)) {
                return true;
            } else {
                set.add(num);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 1 };
        System.out.println(containsDuplicate3(nums));
    }
}
