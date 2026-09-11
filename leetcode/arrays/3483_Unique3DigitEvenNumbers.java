class Solution {
    public int totalNumbers(int[] digits) {
        int[] count = new int[10];
        for (int d : digits) {
            count[d]++;
        }

        int total = 0;
        for (int num = 100; num < 1000; num += 2) {
            int d1 = num / 100, d2 = (num / 10) % 10,d3 = num % 10;        

            int[] currentCount = new int[10];
            currentCount[d1]++;
            currentCount[d2]++;
            currentCount[d3]++;

            boolean isValid = true;
            for (int i = 0; i < 10; i++) {
                if (currentCount[i] > count[i]) {
                    isValid = false;
                    break;
                }
            }
            if (isValid) {
                total++;
            }
        }
        return total;
    }
}
