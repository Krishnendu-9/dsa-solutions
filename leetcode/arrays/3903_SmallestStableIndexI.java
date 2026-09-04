class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int len = nums.length;
        int[] leftMax = new int[len], rightMin = new int[len];
      
        int max = nums[0];
        for (int i = 0; i < len; i++) {
            max = Math.max(max,nums[i]);
            leftMax[i] = max;
        }
      
        int min = nums[len - 1];
        for (int i = len - 1;i >= 0; i--){
            min = Math.min(min, nums[i]);
            rightMin[i] = min;
        }

        for (int i = 0; i < len; i++) {
            if (leftMax[i] - rightMin[i] <= k){
                return i;
            }
        }
        return -1;
    }
}
