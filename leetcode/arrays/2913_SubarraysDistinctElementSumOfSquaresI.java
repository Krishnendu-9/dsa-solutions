class Solution {
    public int sumCounts(List<Integer> nums) {
        int n = nums.size(),result = 0;
        
        for (int i = 0; i < n; i++) {
            boolean[] seen = new boolean[101]; // nums[i] <= 100, an array of size 101 covers all possible numbers
            int distinct = 0;
            
            for (int j = i; j < n; j++){
                int current = nums.get(j);
                
                if (!seen[current]) {
                    seen[current] = true;
                    distinct++;
                }
                result+= distinct * distinct;
            }
        }
        return result;
    }
}
