/*  Problem: Pass by Reference

    Given an array arr of n elements, reverse the given array in-place.

    Example: Input: n = 5, arr = [1,2,3,4,5] → Output: [5,4,3,2,1]
*/

import java.util.Scanner;
class Solution {
    static void reverse(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        reverse(arr);

        System.out.println("Reversed array:");
        for (int number : arr) {
            System.out.print(number + " ");
        }
        sc.close();
    }
}
