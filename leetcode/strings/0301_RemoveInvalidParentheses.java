class Solution {
    public List<String> removeInvalidParentheses(String s) {
        List<String> result = new ArrayList<>();
        if (s == null) return result;
        
        Queue<String> queue = new LinkedList<>();
        Set<String> visited = new HashSet<>();
        
        queue.add(s);
        visited.add(s);
        
        boolean found = false;
        
        while (!queue.isEmpty()) {
            String current = queue.poll();
            
            if (isValid(current)) {
                result.add(current);
                found = true;
            }
            
            if (found) {
                continue;
            }
            
            for (int i = 0; i < current.length(); i++) {
                char letter = current.charAt(i);
                
                if (letter != '(' && letter != ')') {
                    continue;
                }
                
                String next = current.substring(0, i) + current.substring(i + 1);
                
                if (!visited.contains(next)) {
                    queue.add(next);
                    visited.add(next);
                }
            }
        }
        return result;
    }
    
    private boolean isValid(String s) {
        int open = 0;
        
        for (int i = 0; i < s.length(); i++) {
            char current = s.charAt(i);
            if (current == '(') {
                open++;
            } else if (current == ')') {
                if (open == 0) return false;
                open--;
            }
        }
        return open == 0;
    }
}
