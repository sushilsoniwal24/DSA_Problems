package DSA_Topics.Arrays.Array_1D;

/**
 * ? Linear Search :- Compare Every Element With Target Element.
 * ! Time Complexity :- O(N).
 * ? Space Complexity :- O(1).
 */

public class Ch_02_Linear_Search {

    // ? Method To Implement Linear Search.
    public static boolean search(int[] arr, int target) {

        // * Check For Every Element.
        for (int num : arr) {
            if (num == target) {
                return true;
            }
        }
        return false;
    }
}
