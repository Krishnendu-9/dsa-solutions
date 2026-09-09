class Solution {
    public long countCommas(long n) {
        long totalCommas = 0, commaBoundary = 1000; 
        
        while (n >= commaBoundary){
            totalCommas +=(n - commaBoundary + 1);
            commaBoundary *=1000;
        }
        return totalCommas;
    }
}
