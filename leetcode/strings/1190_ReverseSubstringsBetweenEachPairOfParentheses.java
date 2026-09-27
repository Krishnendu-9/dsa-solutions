class Solution {
    public String reverseParentheses(String s) {
        Stack<StringBuilder> stack = new Stack<>();
        StringBuilder current = new StringBuilder();
        
        for (int i = 0; i < s.length(); i++) {
            char letter = s.charAt(i);
            
            if (letter == '(') {
                stack.push(current);
                current = new StringBuilder();
            } else if (letter ==')'){
                current.reverse();
                
                StringBuilder previous =stack.pop();
                previous.append(current);
                current = previous;
            } else {
                current.append(letter);
            }
        }
        return current.toString();
    }
}
