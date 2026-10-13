class Solution {
    public long maxAlternatingSum(int[] nums) {
        int n = nums.length,half = n / 2;
        long result = 0;
        
        for (int i = 0; i < n; i++) {
            nums[i] = Math.abs(nums[i]);
        }

        Arrays.sort(nums);
        
        for (int i = 0; i < n; i++) {
            long square = (long) nums[i] * nums[i];
            
            if (i < half) {
                result -= square;
            } else {
                result += square;
            }
        }
        return result;
    }
}
