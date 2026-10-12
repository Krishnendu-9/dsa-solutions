class Solution {
    public int maxSum(List<Integer> nums, int k) {
        int[] count = new int[31];
        
        for (int num : nums) {
            for (int bit = 0; bit < 31; bit++){
                if ((num & (1 << bit)) != 0) {
                    count[bit]++;
                }
            }
        }
        
        long result = 0, mod =1000000007;
        
        for (int i = 0; i < k; i++) {
            long num = 0;
            
            for (int bit = 0; bit < 31; bit++) {
                if (count[bit] > 0) {
                    num |= (1<< bit);
                    count[bit]--;
                }
            }
            result = (result + (num * num) % mod) % mod;
        }
        return (int) result;
    }
}
