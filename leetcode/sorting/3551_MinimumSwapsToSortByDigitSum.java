class Solution {
    public int minSwaps(int[] nums) {
        int n = nums.length, result=0;
        int[][] arr = new int[n][3];
        
        for (int i = 0; i < n; i++) {
            arr[i][0] = nums[i];
            arr[i][1] = sumDigits(nums[i]);
            arr[i][2] = i;
        }
        Arrays.sort(arr, (a, b) -> {
            if (a[1] != b[1]) {
                return Integer.compare(a[1], b[1]);
            }
            return Integer.compare(a[0], b[0]);
        });
        boolean[] visited = new boolean[n];

        for (int i = 0; i < n; i++) {
            if (visited[i] || arr[i][2] == i) {
                continue;
            }
            
            int cycleSize = 0, current = i;
            
            while (!visited[current]) {
                visited[current] = true;
                current = arr[current][2];
                cycleSize++;
            }
            if (cycleSize > 0) {
                result += (cycleSize - 1);
            }
        }
        return result;
    }
    
    private int sumDigits(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
}
