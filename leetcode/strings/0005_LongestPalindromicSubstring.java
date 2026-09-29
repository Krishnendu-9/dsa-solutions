class Solution {
    public String longestPalindrome(String s) {
        if (s == null || s.length() < 1) {
            return "";
        }
        
        int start = 0,maxLength = 0;
        for (int center = 0; center < s.length(); center++) {
            // Check odd-length palindromes
            int oddLength = expandAroundCenter(s, center, center);
            
            // Check even-length palindromes
            int evenLength = expandAroundCenter(s, center, center + 1);
            
            // Take the longest length found from this center
            int currentLength = Math.max(oddLength, evenLength);
            
            if (currentLength > maxLength) {
                start = center - (currentLength - 1) / 2;
                maxLength = currentLength;
            }
        }
        return s.substring(start, start + maxLength);
    }
    
    private int expandAroundCenter(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return right - left - 1;
    }
}
