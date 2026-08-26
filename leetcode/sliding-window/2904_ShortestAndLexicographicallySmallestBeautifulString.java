class Solution {
    public String shortestBeautifulSubstring(String s, int k) {
        int left = 0, onesCount = 0;
        String bestStr = "";
        
        for (int right = 0; right < s.length(); right++) {
            if (s.charAt(right) == '1') {
                onesCount++;
            }

            while (onesCount > k || (onesCount == k && s.charAt(left) == '0')){
                if (s.charAt(left) == '1') {
                    onesCount--;
                }
                left++;
            }
            
            if (onesCount == k) {
                String candidate = s.substring(left, right + 1);
            
                if (bestStr.isEmpty() || 
                    candidate.length() < bestStr.length() || 
                    (candidate.length() == bestStr.length() && candidate.compareTo(bestStr) < 0)){
                    bestStr = candidate;
                }
            }
        }
        return bestStr;
    }
}
