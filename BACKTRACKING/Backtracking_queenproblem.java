public class Backtracking_queenproblem {

    public static void printBoard(int[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static boolean isSafe(int[][] board, int row, int col) {
        for (int i = 0; i < row; i++) {
            if (board[i][col] == 1) {
                return false;
            }
        }

        for (int i = row, j = col; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 1) {
                return false;
            }
        }

        for (int i = row, j = col; i >= 0 && j < board.length; i--, j++) {
            if (board[i][j] == 1) {
                return false;
            }
        }

        return true;
    }

    public static boolean solveNQueens(int[][] board, int row) {
        if (row >= board.length) {
            return true;
        }

        for (int col = 0; col < board.length; col++) {
            if (isSafe(board, row, col)) {
                board[row][col] = 1;

                if (solveNQueens(board, row + 1)) {
                    return true;
                }

                board[row][col] = 0;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        int n = 8;  
        int[][] board = new int[n][n];

        if (solveNQueens(board, 0)) {
            System.out.println("Solution found:");
            printBoard(board);
        } else {
            System.out.println("No solution exists.");
        }
    }
}
