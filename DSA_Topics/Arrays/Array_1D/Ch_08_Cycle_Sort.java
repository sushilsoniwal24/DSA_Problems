package DSA_Topics.Arrays.Array_1D;

import java.util.Arrays;

/**
 * ? Cyclic_Sort:- Swap Element With His Correct Position.
 * ! Unstable Sorting Algorithm.
 * ? Time Complexity:- O(n).
 * ! Space Complexity :- O(1).
 */

public class Ch_08_Cycle_Sort {

    // * Array Range :- [0-N].
    public static void sort0(int[] arr, int size) {
        int index = 0;
        while (index < size) {
            int correct_idx = arr[index];
            if (arr[index] != arr[correct_idx]) {
                swap(arr, index, correct_idx);
            } else {
                index++;
            }
        }
    }

    // * Array Range :- [1-N].
    public static void sort1(int[] arr, int size) {
        int index = 0;
        while (index < size) {
            int correct_idx = arr[index] - 1;
            if (arr[index] != arr[correct_idx]) {
                swap(arr, index, correct_idx);
            } else {
                index++;
            }
        }
    }

    // * Method For Swapping.
    private static void swap(int[] arr, int idx, int idx2) {
        int temp = arr[idx];
        arr[idx] = arr[idx2];
        arr[idx2] = temp;
    }

    public static void main(String[] args) {

        // * Array [0-N].
        int[] arr0 = { 3, 1, 0, 2, 4 };
        int size0 = arr0.length;
        sort0(arr0, size0);
        System.out.println(Arrays.toString(arr0));

        // * Array [1-N].
        int[] arr1 = { 3, 1, 5, 2, 4 };
        int size1 = arr1.length;
        sort1(arr1, size1);
        System.out.println(Arrays.toString(arr1));
    }
}
