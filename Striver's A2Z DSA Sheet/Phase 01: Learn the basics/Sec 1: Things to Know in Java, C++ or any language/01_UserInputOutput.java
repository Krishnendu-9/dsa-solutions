/*  Problem: Input Output
    
    Complete the program to take an integer input from the user and print the same value on the screen.

    Example: Input: 7 → Output: 7

    Constraint:
    -1000 <= User Input <= 1000
*/

import java.util.Scanner;

public class UserInputOutput {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        System.out.println(number);

        sc.close();
    }
}
