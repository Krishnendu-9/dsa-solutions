class Solution {
    public int reverseDegree(String s) {
        int sum = 0, value = 0,position = 0;
        
        for (int i = 0; i < s.length(); i++){
            char letter= s.charAt(i);
            value = 'z' -letter + 1;
            position = i + 1;
            
            sum += (value * position);
        }
        
        return sum;
    }
}
