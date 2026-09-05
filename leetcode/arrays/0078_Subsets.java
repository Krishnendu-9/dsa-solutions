class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        generateSubsets(0, nums, new ArrayList<>(), result);
        return result;
    }

    private void generateSubsets(int startIndex, int[] nums, List<Integer> currentSubset, List<List<Integer>> result){
        result.add(new ArrayList<>(currentSubset));

        for (int i = startIndex; i < nums.length; i++){
            currentSubset.add(nums[i]);
            generateSubsets(i + 1, nums,currentSubset, result);
            currentSubset.remove(currentSubset.size() -1);
        }
    }
}
