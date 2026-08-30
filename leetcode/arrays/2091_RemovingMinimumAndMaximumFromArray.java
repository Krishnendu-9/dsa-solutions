class Solution {
    public int minimumDeletions(int[] nums) {
        int n = nums.length;
        if (n <= 2) {
            return n;
        }

        int minId = 0, maxId = 0;
        for (int i = 1; i < n; i++) {
            if (nums[i] < nums[minId]) {
                minId = i;
            }
            if (nums[i] > nums[maxId]) {
                maxId = i;
            }
        }

        int i = Math.min(minId, maxId);
        int j = Math.max(minId, maxId);
        
        int front = j + 1;
        int back = n - i;
        int both = (i + 1) + (n - j);
        
        return Math.min(front, Math.min(back, both));
    }
}
