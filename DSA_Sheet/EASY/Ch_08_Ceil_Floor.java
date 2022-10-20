// Todo:- ( Ceil & Floor In A Sorted Array).

package DSA_Sheet.EASY;

public class Ch_08_Ceil_Floor {

    /**
     * ? Ceil :- Smallest Number >= target.
     * ! Time Complexity = O(logN).
     * ? Space Complexity = O(1).
     */
    public static int ceil(int[] arr, int target) {
        int len = arr.length;
        int low = 0, high = len - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == target) {
                return arr[mid];
            }
            if (arr[mid] > target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return arr[low]; // * Ceil
    }
    // *-------------------------------------------------------

    /**
     * ? Floor :- Largest Number <= target.
     * ! Time Complexity = O(logN).
     * ? Space Complexity = O(1).
     */
    public static int floor(int[] arr, int target) {
        int len = arr.length;
        int low = 0, high = len - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == target) {
                return arr[mid];
            }
            if (arr[mid] > target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return arr[high]; // * Floor
    }

    public static void main(String[] args) {
        int[] arr = { 2, 6, 12, 15, 19, 25, 30 };
        int target = 31;
        // System.out.println(ceil(arr, target));
        System.out.println(floor(arr, target));

    }
}
