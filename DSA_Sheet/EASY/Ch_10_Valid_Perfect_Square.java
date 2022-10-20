// Todo:- ( Valid Perfect Square :- https://bit.ly/3Sg8z8a )

package DSA_Sheet.EASY;

public class Ch_10_Valid_Perfect_Square {

    /**
     * ? Method-01 :- Using Linear Search.
     * ! Time Complexity :- O(N*N).
     * ? Space Complexity :- O(1).
     */
    public static boolean isPerfectSquare1(int num) {
        if (num == 1) {
            return true;
        }

        long x = 2;
        while (x * x <= num) {
            x++;
        }

        x = x - 1;

        boolean isperfect = (x * x == num) ? true : false;
        return isperfect;
    }
    // *---------------------------------------------------------------

    /**
     * ? Method-02 :- Using Binary Search.
     * ! Time Complexity :- O(logN).
     * ? Space Complexity :- O(1).
     */
    public static boolean isPerfectSquare2(int num) {
        if (num == 1) {
            return true;
        }

        long s = 1, e = num / 2;
        while (s <= e) {
            long m = s + (e - s) / 2;
            if (m * m == num) {
                return true;
            } else if (m * m > num) {
                e = m - 1;
            } else {
                s = m + 1;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isPerfectSquare2(808201));
    }
}
