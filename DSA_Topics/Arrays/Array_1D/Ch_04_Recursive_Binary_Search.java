package DSA_Topics.Arrays.Array_1D;

public class Ch_04_Recursive_Binary_Search {

    // ! Time Complexity :- O(logN) & Space Complexity :- O(N).
    public static int search(int[] arr, int start_idx, int end_idx, int target) {

        // Base Case.
        if (start_idx > end_idx) {
            return -1;
        }

        int mid_idx = start_idx + (end_idx - start_idx) / 2;

        if (arr[mid_idx] == target) {
            return mid_idx;
        }
        if (arr[mid_idx] > target) {
            return search(arr, start_idx, mid_idx - 1, target);
        }
        return search(arr, mid_idx + 1, end_idx, target);
    }

    public static void main(String[] args) {
        int[] arr = { 4, 7, 19, 20, 25 };
        System.out.println(search(arr, 0, arr.length - 1, 22));
    }
}
