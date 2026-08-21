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
