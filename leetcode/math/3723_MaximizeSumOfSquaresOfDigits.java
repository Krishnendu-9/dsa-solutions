class Solution {
    public String maxSumOfSquares(int num, int sum) {
        if (sum > 9 * num) {
            return "";
        }
        
        StringBuilder result = new StringBuilder();
        int count = sum / 9, remainder = sum % 9;
        
        for (int i = 0; i < count; i++) {
            result.append('9');
        }
        
        if (count < num) {
            result.append(remainder);
        }
        while (result.length() < num) {
            result.append('0');
        }
        return result.toString();
    }
}
