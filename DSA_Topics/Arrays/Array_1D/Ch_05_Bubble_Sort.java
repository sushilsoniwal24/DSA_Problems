package DSA_Topics.Arrays.Array_1D;

import java.util.Arrays;

/**
 * ? Bubble_Sort:- Swap two adjacent elements if they are in wrong order.
 * ! Stable Sorting Algorithm.
 * ? Time Complexity:- O(n^2) In Worst Case & O(n) In Best case.
 * ! Space Complexity :- O(1).
 */

public class Ch_05_Bubble_Sort {
    
    // ? Method To Implement Bubble Sort.
    public static void sort(int[] arr, int size) {

        // * Outer Loop For No. Of Passes.
        for (int pass = 0; pass < size - 1; pass++) {
            boolean isSwapped = false;

            // * Inner Loop For Comparison & swapping
            for (int index = 0; index < size - pass - 1; index++) {
                if (arr[index] > arr[index + 1]) {
                    int temp = arr[index];
                    arr[index] = arr[index + 1];
                    arr[index + 1] = temp;
                    isSwapped = true;
                }
            }
            if (!isSwapped) {
                break; // * Array Is Now Sorted, No Need To Check Further.
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = { 3, 1, 7, 11, 4, 2 };
        int size = arr.length;
        sort(arr, size);
        System.out.println(Arrays.toString(arr));
    }
}
