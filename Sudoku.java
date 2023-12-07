package cs176l;

public class Sudoku {
	public boolean checkSudoku(char[][] board) {
        for (int i = 0; i < 9; i++) {
            if (!checkRow(board, i) || !checkColumn(board, i) || !checkSubBox(board, i)) {
                return false;
            }
        }
        return true;
    }

    private boolean checkRow(char[][] board, int row) {
        boolean[] seen = new boolean[9];
        for (int i = 0; i < 9; i++) {
            char now = board[row][i];
            if (now != '.' && seen[now - '1']) {
                return false;
            }
            if (now != '.') {
                seen[now - '1'] = true;
            }
        }
        return true;
    }

    private boolean checkColumn(char[][] board, int col) {
        boolean[] seen = new boolean[9];
        for (int i = 0; i < 9; i++) {
            char now = board[i][col];
            if (now != '.' && seen[now - '1']) {
                return false;
            }
            if (now != '.') {
                seen[now - '1'] = true;
            }
        }
        return true;
    }

    private boolean checkSubBox(char[][] board, int box) {
        boolean[] seen = new boolean[9];
        int rowOffset = 3 * (box / 3);
        int colOffset = 3 * (box % 3);
        for (int i = rowOffset; i < rowOffset + 3; i++) {
            for (int j = colOffset; j < colOffset + 3; j++) {
                char now = board[i][j];
                if (now != '.' && seen[now - '1']) {
                    return false;
                }
                if (now != '.') {
                    seen[now - '1'] = true;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
    	System.out.println("Welcome to Sudoku!");
        Sudoku validator = new Sudoku();

        char[][] sudokuBoard1 = {
            {'5','3','.','.','7','.','.','.','.'},
            {'6','.','.','1','9','5','.','.','.'},
            {'.','9','8','.','.','.','.','6','.'},
            {'8','.','.','.','6','.','.','.','3'},
            {'4','.','.','8','.','3','.','.','1'},
            {'7','.','.','.','2','.','.','.','6'},
            {'.','6','.','.','.','.','2','8','.'},
            {'.','.','.','4','1','9','.','.','5'},
            {'.','.','.','.','8','.','.','7','9'}
        };

        char[][] sudokuBoard2 = {
            {'8','3','.','.','7','.','.','.','.'},
            {'6','.','.','1','9','5','.','.','.'},
            {'.','9','8','.','.','.','.','6','.'},
            {'8','.','.','.','6','.','.','.','3'},
            {'4','.','.','8','.','3','.','.','1'},
            {'7','.','.','.','2','.','.','.','6'},
            {'.','6','.','.','.','.','2','8','.'},
            {'.','.','.','4','1','9','.','.','5'},
            {'.','.','.','.','8','.','.','7','9'}
        };

        System.out.println("Board 1: " + validator.checkSudoku(sudokuBoard1));
        System.out.println("Board 2: " + validator.checkSudoku(sudokuBoard2));

    }
}
