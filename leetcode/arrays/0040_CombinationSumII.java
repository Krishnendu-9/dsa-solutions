class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        
        Arrays.sort(candidates);
        findCombinations(candidates, target, 0, new ArrayList<>(), result);
        return result;
    }

    private void findCombinations(int[] candidates, int remain, int startIndex, List<Integer> currentComb, List<List<Integer>> result) {
        if (remain == 0) {
            result.add(new ArrayList<>(currentComb));
            return;
        }

        for (int i = startIndex; i < candidates.length; i++){
            if (i > startIndex && candidates[i] == candidates[i - 1]){
                continue;
            }
            
            if (candidates[i] > remain) {
                break;
            }

            // 1. Choose the current number
            currentComb.add(candidates[i]);
            
            // 2. Explore further
            findCombinations(candidates, remain - candidates[i], i + 1, currentComb, result);
            
            // 3. Backtrack
            currentComb.remove(currentComb.size() - 1);
        }
    }
}
