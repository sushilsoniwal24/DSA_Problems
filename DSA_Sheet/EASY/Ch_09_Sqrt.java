// Todo:- ( Sqrt(x) :- https://leetcode.com/problems/sqrtx/description/ ).

package DSA_Sheet.EASY;

public class Ch_09_Sqrt {

    /** 
     * ? Method-01 :- Using Binary Search.
     * ! Time Complexity :- O(logN).
     * ? Space Complexity :- O(1).
     */
    public static int mySqrt(int x) {
        if (x <= 1) {
            return x;
        }

        int s = 1, e = x / 2;
        while (s <= e) {
            int m = s + (e - s) / 2;

            if (m == x / m) {
                return m;
            }
            if (m > x / m) {
                e = m - 1;
            } else {
                s = m + 1;
            }
        }

        return e;
    }

    public static void main(String[] args) {
        System.out.println(mySqrt(18));
    }
}
