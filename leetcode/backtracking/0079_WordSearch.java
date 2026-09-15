class Solution {
    public boolean exist(char[][] board, String word) {
        int numRows = board.length, numCols = board[0].length;

        for (int row = 0; row < numRows; row++) {
            for (int col = 0; col < numCols; col++) {
                if (board[row][col] == word.charAt(0)) {
                    if (explore(board, word, row, col, 0)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    private boolean explore(char[][] board, String word, int row, int col, int wordIndex) {
        if (wordIndex == word.length()) {
            return true;
        }
        if (row < 0 || row >= board.length || col < 0 || col >= board[0].length || board[row][col] != word.charAt(wordIndex)) {
            return false;
        }

        char originalChar = board[row][col];
        board[row][col] = '#';

        boolean foundWord = explore(board, word, row - 1, col, wordIndex + 1) || // Up
                            explore(board, word, row + 1, col, wordIndex + 1) || // Down
                            explore(board, word, row, col - 1, wordIndex + 1) || // Left
                            explore(board, word, row, col + 1, wordIndex + 1);   // Right

        board[row][col] = originalChar;
        return foundWord;
    }
}
