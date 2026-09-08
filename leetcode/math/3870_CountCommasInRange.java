class Solution {
    public int countCommas(int n) {
        int totalCommas = 0;
        long commaThreshold = 1000; 
        
        while (n >= commaThreshold) {
            totalCommas += (n - commaThreshold + 1);
            commaThreshold *= 1000;
        }
        return totalCommas;
    }
}
