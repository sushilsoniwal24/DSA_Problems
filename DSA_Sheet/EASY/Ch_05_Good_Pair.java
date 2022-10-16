// Todo:- ( Number of Good Pairs :- https://bit.ly/3Tl6yZ4 )

package DSA_Sheet.EASY;

import java.util.HashMap;

public class Ch_05_Good_Pair {

    /**
     * ? Method-01 :- Using Two For-Loops.
     * ! T.C = O(N*N).
     * ! S.C = O(1).
     */
    public static int numIdenticalPairs1(int[] nums) {
        int pairs = 0;
        int n = nums.length;

        // Check For Every Possible Pair.
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (nums[i] == nums[j]) {
                    pairs++;
                }
            }
        }
        return pairs;
    }
    // *-------------------------------------------------------------------

    /**
     * ? Method-02 :- Using HashMap.
     * ! T.C = O(N).
     * ! S.C = O(N).
     */
    public static int numIdenticalPairs2(int[] nums) {
        int pairs = 0;
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            int occur = map.getOrDefault(num, 0);
            pairs += occur;
            map.put(num, occur + 1);
        }

        return pairs;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 1, 1, 3 };
        System.out.println(numIdenticalPairs2(arr));
    }
}
