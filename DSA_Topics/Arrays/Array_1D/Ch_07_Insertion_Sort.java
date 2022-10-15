package DSA_Topics.Arrays.Array_1D;

import java.util.Arrays;

/**
 * ? Insertion_Sort:- Pick An Element From Unsorted Array, Place It At
 * Correct Position and Shifts Other Elements Accordingly.
 * ! Stable Sorting Algorithm.
 * ? Time Complexity:- O(n^2) In Worst Case & O(n) In Best Case.
 * ! Space Complexity :- O(1).
 */

public class Ch_07_Insertion_Sort {

    // ? Method To Implement Insertion Sort.
    public static void sort(int[] arr, int size) {
        for (int i = 1; i < size; i++) {
            int current = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > current) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = current; // * Place Current At Its Right Position.
        }
    }

    public static void main(String[] args) {
        int[] arr = { 3, 1, 7, 4, 11, 2 };
        int size = arr.length;
        sort(arr, size);
        System.out.println(Arrays.toString(arr));
    }
}
