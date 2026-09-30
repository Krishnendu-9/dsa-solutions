class Solution {
    public int[] maxDepthAfterSplit(String seq) {
        int[] result = new int[seq.length()];
        int currentDepth = 0;
        
        for (int i = 0; i < seq.length(); i++){
            char bracket = seq.charAt(i);
            
            if (bracket == '(') {
                currentDepth++;
                result[i] = currentDepth % 2;
            } else if (bracket== ')') {
                result[i] = currentDepth % 2;
                currentDepth--;
            }
        }
        return result;
    }
}
