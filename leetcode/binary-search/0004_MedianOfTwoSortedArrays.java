class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        // always run binary search on the smaller array
        if (nums1.length > nums2.length) {
            return findMedianSortedArrays(nums2, nums1);
        }
        
        int[] smallerArray =nums1,largerArray = nums2;
        int x = smallerArray.length, y =largerArray.length;
        
        int left = 0, right= x;
        
        while (left <= right) {
            int partitionX = left+ (right - left)/ 2;

            int partitionY = (x +y + 1) / 2 - partitionX;
            
            int maxLeftX = (partitionX == 0) ? Integer.MIN_VALUE :smallerArray[partitionX - 1];
            int minRightX = (partitionX == x) ? Integer.MAX_VALUE : smallerArray[partitionX];
            
            int maxLeftY = (partitionY == 0) ? Integer.MIN_VALUE : largerArray[partitionY - 1];
            int minRightY =(partitionY == y) ? Integer.MAX_VALUE : largerArray[partitionY];
            
            if (maxLeftX <= minRightY && maxLeftY <= minRightX){
                
                if ((x + y) % 2 == 0){
                    return ((double) Math.max(maxLeftX, maxLeftY)+ Math.min(minRightX, minRightY)) /2;
                } 
                else {
                    return (double) Math.max(maxLeftX, maxLeftY);
                }
            } 
            else if (maxLeftX >minRightY) {
                right = partitionX - 1;
            } 
            else {
                left=partitionX + 1;
            }
        }
        throw new IllegalArgumentException("Input arrays are invalid.");
    }
}
