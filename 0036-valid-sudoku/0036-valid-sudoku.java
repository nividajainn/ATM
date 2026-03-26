class Solution {
    public boolean isValidSudoku(char[][] board) {

        // set will store unique entries
        HashSet<String> set = new HashSet<>();

        // traverse whole 9x9 board
        for(int i = 0; i < 9; i++) {
            for(int j = 0; j < 9; j++) {

                // current cell value
                char num = board[i][j];

                // ignore empty cells
                if(num != '.') {

                    // try adding:
                    // 1. same number in same row
                    // 2. same number in same column
                    // 3. same number in same 3x3 box
                    // if any already exists, sudoku is invalid
                    if(!set.add(num + " in row " + i) ||
                       !set.add(num + " in col " + j) ||
                       !set.add(num + " in box " + i/3 + "-" + j/3)) {
                        return false;
                    }
                }
            }
        }

        // no duplicate found
        return true;
    }
}