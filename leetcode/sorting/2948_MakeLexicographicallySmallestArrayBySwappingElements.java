class Solution {
    public int[] lexicographicallySmallestArray(int[] nums, int limit) {
        int n = nums.length;

        int[][] arr = new int[n][2];
        for (int i = 0; i < n; i++) {
            arr[i][0] = nums[i];
            arr[i][1] = i;
        }
       
        Arrays.sort(arr, (a, b) -> Integer.compare(a[0], b[0]));
        
        int[] res = new int[n];
        int i = 0;
        
        while (i < n) {
            int start = i;
            i++;
            while (i < n && arr[i][0] - arr[i - 1][0] <= limit) {
                i++;
            }
            int[] indices = new int[i - start];
            for (int j = start; j < i; j++) {
                indices[j - start] = arr[j][1];
            }
         
            Arrays.sort(indices);
            for (int j = start; j < i; j++) {
                res[indices[j - start]] = arr[j][0];
            }
        }
        
        return res;
    }
}
