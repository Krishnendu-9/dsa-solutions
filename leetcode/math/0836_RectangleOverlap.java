class Solution {
    public boolean isRectangleOverlap(int[] rec1, int[] rec2) {
        
        boolean isCompletelyLeft = rec1[2] <= rec2[0], isCompletelyRight = rec1[0] >= rec2[2],isCompletelyBelow = rec1[3] <= rec2[1], isCompletelyAbove = rec1[1] >= rec2[3];
        
        return !(isCompletelyLeft || isCompletelyRight || isCompletelyBelow || isCompletelyAbove);
    }
}
