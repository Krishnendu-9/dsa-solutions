class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder result = new StringBuilder();
        int open = 0;
        
        for (int i = 0; i < s.length(); i++) {
            char current = s.charAt(i);
            
            if (current == '(') {
                if (open > 0) {
                    result.append(current);
                }
                open++;
            } else {
                open--;

                if (open > 0) {
                    result.append(current);
                }
            }
        }
        return result.toString();
    }
}
