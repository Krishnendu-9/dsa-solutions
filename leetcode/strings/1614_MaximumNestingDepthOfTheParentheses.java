class Solution {
    public int maxDepth(String s) {
        int currentDepth = 0,maxDepth = 0;
        
        for (int i = 0; i < s.length(); i++){
            char letter = s.charAt(i);
            
            if (letter == '(') {
                currentDepth++;
                maxDepth= Math.max(maxDepth, currentDepth);
            } else if (letter == ')'){
                currentDepth--;
            }
        }
        return maxDepth;
    }
}
