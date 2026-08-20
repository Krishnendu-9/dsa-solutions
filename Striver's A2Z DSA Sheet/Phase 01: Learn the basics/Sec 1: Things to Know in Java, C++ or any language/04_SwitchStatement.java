/*  Problem: Switch Case

    Given an integer representing the day number, print the corresponding
    day of the week. The week starts from Monday (1) and ends on Sunday (7).
    Print "Invalid" for values less than 1 or greater than 7.

    Example: Input: 3 → Output: Wednesday
*/

import java.util.Scanner;
class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter day number: ");
        int day = sc.nextInt();

        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid");
        }

        sc.close();
    }
}
