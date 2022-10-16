// Todo:- (Two Sum :- https://bit.ly/2oCDW1E)

package DSA_Sheet.EASY;

import java.util.Arrays;
import java.util.HashMap;

public class Ch_03_Two_Sum {
    
    /**
     * ? Method-01 :- Using Two For-Loops.
     * ! T.C = O(N*N).
     * ! S.C = O(1).
     */
    public static int[] twoSum1(int[] nums, int target) {
        int size = nums.length;

        // * Check For Every Pair.
        for (int first_idx = 0; first_idx < size - 1; first_idx++) {
            for (int sec_idx = first_idx + 1; sec_idx < size; sec_idx++) {
                if (nums[first_idx] + nums[sec_idx] == target) {
                    return new int[] { first_idx, sec_idx };
                }
            }
        }
        return new int[] {}; // * Not Found.
    }
    // *-------------------------------------------------------------------

    /**
     * ? Method-02 :- Using HashMap.
     * ! T.C = O(N).
     * ! S.C = O(N).
     */
    public static int[] twoSum2(int[] nums, int target) {
        int n=nums.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int idx=0;idx<n;idx++){
            int curr_num = nums[idx];
            int req_num = target-curr_num;
            
            if(map.containsKey(req_num)){
                return new int[]{map.get(req_num), idx};
            }
            map.put(curr_num,idx);
        }
        return new int[]{};
    }

    public static void main(String[] args) {
        int[] nums = { 2, 7, 11, 15 };
        int target = 9;
        int[] sol = twoSum2(nums, target);
        System.out.println(Arrays.toString(sol));
    }
}
