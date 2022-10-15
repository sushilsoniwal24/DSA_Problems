package DSA_Topics.Arrays.Array_1D;

import java.util.Arrays;
import java.util.Scanner;

public class Ch_01_Basic {
    
    // Todo :- 2 Ways To Declare & Initialize Array.

    // * Method - 01.
    public static void method1() {
        int[] arr = { 8, 4, 2, 9, 7 };

        // Access Elements.
        System.out.println("The First Element Is:- " + arr[0]);
        System.out.println("The Second Element Is:- " + arr[1]);
        System.out.println("The Third Element Is:- " + arr[2]);
    }
    // *--------------------------------------------------------------

    // * Method - 02.
    public static void method2() {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter The Size Of Your Desired Array :- ");
        int size = in.nextInt();

        int[] arr = new int[size];

        System.out.print("Enter The Elements Of Your Array Till The Entered Size :- ");
        for (int idx = 0; idx < size; idx++) {
            arr[idx] = in.nextInt();
        }

        System.out.println("Your Array Is :- " + Arrays.toString(arr));

        in.close();
    }

    public static void main(String[] args) {
        method1();
        method2();
    }
}
