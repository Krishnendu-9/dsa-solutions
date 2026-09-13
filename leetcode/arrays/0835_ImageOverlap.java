class Solution {
    public int largestOverlap(int[][] img1, int[][] img2) {
        int gridSize = img1.length;

        int[] img1Rows = new int[900],img1Cols = new int[900]; 
        int[] img2Rows = new int[900], img2Cols = new int[900];
        int img1OneCount = 0, img2OneCount = 0;

        for (int row = 0; row < gridSize; row++){
            for (int col = 0; col < gridSize; col++) {
                if (img1[row][col] == 1) {
                    img1Rows[img1OneCount] = row;
                    img1Cols[img1OneCount] = col;
                    img1OneCount++;
                }
                if (img2[row][col] == 1){
                    img2Rows[img2OneCount] = row;
                    img2Cols[img2OneCount] = col;
                    img2OneCount++;
                }
            }
        }

        int[][] shiftTallies = new int[2 * gridSize][2 * gridSize];
        int maxOverlap = 0;

        for (int i = 0; i < img1OneCount; i++) {
            for (int j = 0; j < img2OneCount; j++) {
                
                int rowShift = img2Rows[j] - img1Rows[i] + gridSize;
                int colShift = img2Cols[j] - img1Cols[i] + gridSize;
                
                shiftTallies[rowShift][colShift]++;

                if (shiftTallies[rowShift][colShift] > maxOverlap) {
                    maxOverlap = shiftTallies[rowShift][colShift];
                }
            }
        }
        return maxOverlap;
    }
}
