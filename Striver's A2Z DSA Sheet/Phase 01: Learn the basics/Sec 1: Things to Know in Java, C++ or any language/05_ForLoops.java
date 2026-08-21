/*  Problem: For Loop

    Given two integers low and high, return the sum of all integers
    from low to high, inclusive.

    Example: Input: low = 1, high = 5 → Output: 15
*/

import java.util.Scanner;

class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter low: ");
        int low = sc.nextInt();

        System.out.print("Enter high: ");
        int high = sc.nextInt();

        int sum = 0;

        for (int i = low; i <= high; i++) {
            sum += i;
        }

        System.out.println("Sum: " + sum);

        sc.close();
    }
}
