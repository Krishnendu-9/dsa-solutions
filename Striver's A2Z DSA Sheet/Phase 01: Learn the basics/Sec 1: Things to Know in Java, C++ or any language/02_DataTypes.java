/*  Topic: Arrays and Strings

    Learn how to declare, initialize and use arrays and strings in Java.

    Example: String = "Hello", Array = {10, 20, 30}
*/

public class Solution {
    public static void main(String[] args) {

        // String
        String name = "Krishnendu";

        System.out.println("String: " + name);
        System.out.println("First character: " + name.charAt(0));
      
        // Array
        int[] numbers = {10, 20, 30, 40, 50};

        System.out.println("First array element: " + numbers[0]);
        System.out.println("Third array element: " + numbers[2]);

        System.out.println("All array elements:");

        for (int number : numbers) {
            System.out.println(number);
        }
    }
}
