class Solution {
    public int sumOfSquares(int[] nums) {
        int n = nums.length,num, result = 0;
       
        for (int i = 1; i <= n; i++){
            if (n % i == 0) {
                num= nums[i - 1];
                result += num * num;
            }
        }
        
        return result;
    }
}
