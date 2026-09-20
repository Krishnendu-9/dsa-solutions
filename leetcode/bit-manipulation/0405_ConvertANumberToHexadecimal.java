class Solution {
    public String toHex(int num) {
        if (num == 0) {
            return "0";
        }

        char[] hexMap = {'0','1','2','3','4','5','6','7','8','9','a','b','c','d','e','f'};
        
        StringBuilder result = new StringBuilder();
        int value = 0;

        while (num != 0) {
            value = num & 15;
            result.append(hexMap[value]);
            num = num >>> 4;
        }

        return result.reverse().toString();
    }
}
