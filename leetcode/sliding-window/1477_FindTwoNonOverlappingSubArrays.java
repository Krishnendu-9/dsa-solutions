class Solution {
    public int minSumOfLengths(int[] arr, int target) {
        int n = arr.length;
        int[] dp = new int[n];
        
        int minLen = Integer.MAX_VALUE, result = Integer.MAX_VALUE;
        int left = 0,sum= 0;

        for (int right = 0; right < n; right++) {
            sum += arr[right];
            while (sum > target && left <=right){
                sum -= arr[left];
                left++;
            }

            if (sum == target) {
                int len = right - left + 1;

                if (left > 0 && dp[left - 1] != Integer.MAX_VALUE){
                    result = Math.min(result, len + dp[left - 1]);
                }
                minLen = Math.min(minLen, len);
            }
            dp[right] =minLen;
        }
        return result == Integer.MAX_VALUE ? -1 : result;
    }
}
