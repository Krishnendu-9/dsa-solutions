class Solution {
    public boolean isValidSudoku(char[][] board) {
        // boolean[9][9] represents [which_row/col/box][which_digit_from_0_to_8]
        boolean[][] rows = new boolean[9][9];
        boolean[][] cols = new boolean[9][9];
        boolean[][] boxes = new boolean[9][9];
        
        for (int r = 0; r < 9; r++) {
            for (int c = 0; c < 9; c++){
                if (board[r][c] == '.') {
                    continue;
                }

                int val = board[r][c] - '1', boxIndex = (r / 3) * 3 + (c / 3);
                
                // Check if this number was already seen in the current row, column, or box
                if (rows[r][val] || cols[c][val] || boxes[boxIndex][val]){
                    return false;
                }
                rows[r][val] = true;
                cols[c][val] = true;
                boxes[boxIndex][val] = true;
            }
        }
        return true;
    }
}
