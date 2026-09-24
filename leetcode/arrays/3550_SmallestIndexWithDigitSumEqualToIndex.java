class Solution {
    public int smallestIndex(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int currentValue = nums[i],digitSum = 0;
            
            while (currentValue > 0) {
                digitSum += currentValue % 10;
                currentValue /= 10;
            }
            
            if (digitSum == i) {
                return i;
            }
        }
        return -1;
    }
}
