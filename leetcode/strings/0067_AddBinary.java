class Solution {
    public String addBinary(String a, String b) {
        StringBuilder binarySum = new StringBuilder();
        
        int indexA = a.length() - 1,indexB = b.length() - 1, carry = 0;
        
        while (indexA >= 0 || indexB >= 0 || carry > 0) {
            int totalSum = carry;

            if (indexA >= 0) {
                totalSum += a.charAt(indexA) - '0';
                indexA--;
            }
            
            if (indexB >= 0) {
                totalSum += b.charAt(indexB) - '0';
                indexB--;
            }
            binarySum.append(totalSum % 2);
            carry = totalSum / 2;
        }
        return binarySum.reverse().toString();
    }
}
