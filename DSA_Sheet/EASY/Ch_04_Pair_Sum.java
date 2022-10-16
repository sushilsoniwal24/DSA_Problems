// Todo:- (Count pairs with given sum:- https://bit.ly/3fE0exr)

package DSA_Sheet.EASY;

import java.util.HashMap;

public class Ch_04_Pair_Sum {

    /**
     * ? Method-01 :- Using Two For-Loops.
     * ! T.C = O(N*N).
     * ! S.C = O(1).
     */
    public static int getPairsCount1(int[] nums, int n, int k) {
        int pairs = 0;

        // * Check For Every Pair.
        for (int first_idx = 0; first_idx < n; first_idx++) {
            for (int sec_idx = first_idx + 1; sec_idx < n; sec_idx++) {
                if (nums[first_idx] + nums[sec_idx] == k) {
                    pairs++;
                }
            }
        }
        return pairs;
    }
    // *-------------------------------------------------------------------------

    /**
     * ? Method-02 :- Using HashMap.
     * ! T.C = O(N).
     * ! S.C = O(N).
     */
    public static int getPairsCount2(int[] nums, int n, int k) {
        int pairs = 0;
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int idx = 0; idx < n; idx++) {
            int curr_num = nums[idx];
            int req_num = k - curr_num;
            if (map.containsKey(req_num)) {
                pairs += map.get(req_num);
            }

            if (map.containsKey(curr_num)) {
                map.put(curr_num, map.get(curr_num) + 1);
            }

            else {
                map.put(curr_num, 1);
            }
        }
        return pairs;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 1, 1, 1 };
        int n = nums.length;
        int k = 2;

        System.out.println(getPairsCount2(nums, n, k));
    }
}
