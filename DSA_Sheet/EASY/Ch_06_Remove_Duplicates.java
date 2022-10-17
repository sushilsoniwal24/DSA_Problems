// Todo:- (Remove Duplicates From Sorted Array:- https://bit.ly/3STOxAZ)

package DSA_Sheet.EASY;

public class Ch_06_Remove_Duplicates {

    /**
     * ? Method-01 :- Using Two Pointers.
     * ! T.C = O(N).
     * ! S.c = O(1).
     */
    public static int removeDuplicates(int[] nums) {
        int n = nums.length;
        int last_idx = 0;
        for (int curr_idx = 1; curr_idx < n; curr_idx++) {
            if (nums[curr_idx] != nums[last_idx]) {
                last_idx++;
                nums[last_idx] = nums[curr_idx];
            }
        }
        return last_idx + 1;
    }

    public static void main(String[] args) {
        int[] nums = { 0, 0, 1, 1, 1, 2, 3, 3, 4 };
        int len = removeDuplicates(nums);
        for (int i = 0; i < len; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
