class Solution {
    public int minInsertions(String s) {
        int result = 0,need = 0;
        
        for (int i = 0; i < s.length(); i++) {
            char current = s.charAt(i);
            
            if (current == '(') {
                if (need % 2 != 0) {
                    result++;
                    need--; 
                }
                need += 2;
            } else {
                need--;
            
                if (need < 0) {
                    result++;
                    need = 1; 
                }
            }
        }
        return result + need;
    }
}
