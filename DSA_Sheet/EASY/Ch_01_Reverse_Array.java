package DSA_Sheet.EASY;

import java.util.Arrays;

public class Ch_01_Reverse_Array {
    
    /**
     * Todo:- (Iteretive Approach).
     * ! T.C = O(n) & S.C = O(1).
     */
    public static void reverse1(int[] arr, int size) {
        int start = 0, end = size - 1;
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    // *---------------------------------------------------------------------

    /**
     * Todo:- (Recursive Approach).
     * ! T.C = O(n) & S.C = O(n).
     */
    public static void reverse2(int[] arr, int start_idx, int end_idx) {
        if(start_idx<end_idx) {
            int temp = arr[start_idx];
            arr[start_idx] = arr[end_idx];
            arr[end_idx] = temp;
            reverse2(arr, ++start_idx, --end_idx);
        }
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        int size = arr.length;
        // reverse1(arr, size);
        reverse2(arr, 0, size - 1);
        System.out.println(Arrays.toString(arr));
    }
}
