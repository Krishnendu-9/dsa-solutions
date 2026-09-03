class Solution {
    public boolean uniformArray(int[] nums1) {
        int smallestNumber = nums1[0];

        for (int number : nums1){
            if (number < smallestNumber){
                smallestNumber = number;
            }
        }

        if (smallestNumber % 2 != 0) {
            return true;
        }
       
        for (int number : nums1) {
            if (number % 2 != 0){
                return false;
            }
        }
        return true;
    }
}
