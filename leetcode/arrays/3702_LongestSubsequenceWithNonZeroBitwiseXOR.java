class Solution {
    public int longestSubsequence(int[] nums) {

        int xor = 0;
        boolean found = false;

        for (int num : nums) {
            xor ^= num;
            if (num != 0) {
                found = true;
            }
        }
        
        if (xor != 0) {
            return nums.length;
        }
        if (found) {
            return nums.length - 1;
        }
        return 0;
    }
}
