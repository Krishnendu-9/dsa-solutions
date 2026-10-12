class Solution {
    public long minSumSquareDiff(int[] nums1, int[] nums2, int k1, int k2) {
        int max = 100000;
        long[] count = new long[max + 1];
        
        for (int i = 0; i < nums1.length; i++) {
            int diff = Math.abs(nums1[i] -nums2[i]);
            count[diff]++;
        }
        
        long k =(long) k1 + k2;
        
        for (int diff = max; diff > 0 && k > 0; diff--){
            if (count[diff] == 0) {
                continue;
            }
            if (k >= count[diff]) {
                count[diff - 1] += count[diff];
                k -= count[diff];
                count[diff] = 0;
            } 
            else {
                count[diff -1] += k;
                count[diff] -= k;
                k = 0;
            }
        }
        
        long result= 0;
        for (int diff = 1; diff <= max; diff++) {
            if (count[diff] > 0) {
                result += count[diff] * (long) diff * diff;
            }
        }
        return result;
    }
}
