/*  Problem: While Loop

    Given a digit d (0 to 9), find the sum of the first 50 positive integers
    that end with digit d.

    Example: Input: d = 1 → Output: 12300
*/

import java.util.Scanner;

class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter digit: ");
        int d = sc.nextInt();

        int number = (d == 0) ? 10 : d;
        int sum = 0;
        int count = 0;

        while (count < 50) {
            sum += number;
            number += 10;
            count++;
        }

        System.out.println(sum);

        sc.close();
    }
}

/*
import java.util.*; 
class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a positive integer to start the sequence: ");
        int n = sc.nextInt(); 
        int steps = 0;
        
        System.out.println("Starting sequence for: " + n);
      
        while (n != 1 && n > 0) {
            if (n % 2 == 0) {
                n = n / 2;          // If n is even, divide by 2
            } else {
                n = (n * 3) + 1;   // If n is odd, multiply by 3 and add 1
            }
            steps++;
            System.out.print(n + " ");
        }
        System.out.println("\nFinished! It took " + steps + " steps to reach 1.");
        sc.close();
    }
}
*/
