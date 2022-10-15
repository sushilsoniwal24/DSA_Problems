package DSA_Topics.Arrays.Array_1D;

import java.util.Arrays;

/**
 * ? Selection_Sort:- Take Minimum Element From Unsorted Array & Place It At The
 * Beginning Of The Unsorted Array.
 * ! Not A Stable Sorting Algorithm.
 * ? Time Complexity:- O(n^2) In Both Best & Worst Case.
 * ! Space Complexity :- O(1).
 */

public class Ch_06_Selection_Sort {

    // ? Method To Implement Selection Sort.
    public static void sort(int[] arr, int size) {
        for (int pass = 0; pass < size; pass++) {
            int min_idx = pass;
            for (int index = pass + 1; index < size; index++) {

                // ! Select Minimum In Every Loop.
                if (arr[index] < arr[min_idx]) {
                    min_idx = index;
                }
            }

            // ! Put Minimum At The Correct Position.
            int temp = arr[pass];
            arr[pass] = arr[min_idx];
            arr[min_idx] = temp;
        }
    }

    public static void main(String[] args) {
        int[] arr = { 3, 1, 7, 4, 11, 2 };
        int size = arr.length;
        sort(arr, size);
        System.out.println(Arrays.toString(arr));
    }
}
