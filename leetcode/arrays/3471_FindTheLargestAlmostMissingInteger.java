class Solution {
    public int largestInteger(int[] nums, int k) {
        int n = nums.length;

        if (k == n) {
            int max = nums[0];
            for (int num : nums) {
                max = Math.max(max, num);
            }
            return max;
        }

        if (k == 1) {
            HashMap<Integer, Integer> map = new HashMap<>();
            for (int num : nums) {
                map.put(num, map.getOrDefault(num, 0) + 1);
            }
            int ans = -1;
            for (int num : map.keySet()) {
                if (map.get(num) == 1) {
                    ans = Math.max(ans, num);
                }
            }
            return ans;
        }

        int ans = -1;

        for (int i = 0; i < n; i++) {
            if (i == 0 || i == n - 1) {
                int count = 0;

                for (int num : nums) {
                    if (num == nums[i]) {
                        count++;
                    }
                }
                if (count == 1) {
                    ans = Math.max(ans, nums[i]);
                }
            }
        }
        return ans;
    }
}
