class Solution {
    public int[] resultArray(int[] nums) {

        List<Integer> first = new ArrayList<>(), second = new ArrayList<>();

        first.add(nums[0]);
        second.add(nums[1]);

        for (int i = 2; i < nums.length; i++) {
            if (first.get(first.size() - 1) > second.get(second.size() - 1)){
                first.add(nums[i]);
            } else {
                second.add(nums[i]);
            }
        }
        
        int[] result = new int[nums.length];
        int k = 0;
      
        for (int num : first){
            result[k++] = num;
        }
        for (int num : second){
            result[k++] = num;
        }
        return result;
    }
}
