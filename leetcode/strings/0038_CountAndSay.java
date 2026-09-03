class Solution {
    public String countAndSay(int n) {
        if (n == 1) {
            return "1";
        }

        String current = "1";

        for (int step = 2; step <= n; step++){
            StringBuilder next = new StringBuilder();
            int count = 1;
            
            for (int i = 1; i < current.length(); i++) {
                if (current.charAt(i) == current.charAt(i - 1)){
                    count++;
                } else {
                    next.append(count).append(current.charAt(i - 1));
                    count = 1; 
                }
            }

            next.append(count).append(current.charAt(current.length() - 1));
            current = next.toString();
        }
        return current;
    }
}
