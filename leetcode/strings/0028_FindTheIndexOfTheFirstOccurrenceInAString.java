class Solution {
    public int strStr(String haystack, String needle) {
        int haystackLen = haystack.length(), needleLen = needle.length();

        for (int startIndex = 0; startIndex <= haystackLen - needleLen; startIndex++) {
            boolean isMatch = true;

            for (int j = 0; j < needleLen; j++) {
                if (haystack.charAt(startIndex + j) != needle.charAt(j)) {
                    isMatch = false;
                    break; // Stop checking this window as soon as one character fails
                }
            }
            if (isMatch) {
                return startIndex;
            }
        }
        return -1;
    }
}
