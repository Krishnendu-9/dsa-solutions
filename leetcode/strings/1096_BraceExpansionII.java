class Solution {
    public List<String> braceExpansionII(String expression) {
        Queue<String> queue = new LinkedList<>();
        Set<String> visited = new HashSet<>(), result = new TreeSet<>();
        
        queue.offer(expression);
        visited.add(expression);
        
        while (!queue.isEmpty()) {
            String current = queue.poll();
            int right = current.indexOf('}');
           
            if (right == -1){
                result.add(current);
                continue;
            }
            
            int left= right;
            while (current.charAt(left) !='{') {
                left--;
            }
            
            String prefix = current.substring(0, left);
            String suffix = current.substring(right +1);
            String content = current.substring(left + 1, right);
            String[] options = content.split(",");
          
            for (int i = 0; i < options.length; i++) {
                String nextExpression= prefix + options[i] + suffix;
                
                if (!visited.contains(nextExpression)) {
                    visited.add(nextExpression);
                    queue.offer(nextExpression);
                }
            }
        }
        
        return new ArrayList<>(result);
    }
}
