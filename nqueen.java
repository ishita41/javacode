import java.util.*;

class nqueen {
    private static void solve(int col, char[][] board, List<List<String>> ans, int[] leftRow, int[] upperDiagonal,
            int[] lowerDiagonal, int n) {
        if (col == n) {
            ans.add(construct(board));
            return;
        }
        for (int i = 0; i < n; i++) {
            if (leftRow[i] == 0 && lowerDiagonal[i + col] == 0 && upperDiagonal[n - 1 + col - i] == 0) {
                board[i][col] = 'Q';
                leftRow[i] = 1;
                lowerDiagonal[i + col] = 1;
                upperDiagonal[n - 1 + col - i] = 1;
                solve(col + 1, board, ans, leftRow, upperDiagonal, lowerDiagonal, n);
                board[i][col] = '.';
                leftRow[i] = 0;
                lowerDiagonal[i + col] = 0;
                upperDiagonal[n - 1 + col - i] = 0;
            }
        }
    }

    private static List<String> construct(char[][] board) {
        List<String> res = new ArrayList<>();
        for (int i = 0; i < board.length; i++) {
            res.add(new String(board[i]));
        }
        return res;
    }

    public static void solveNQueens(int n) {
        List<List<String>> ans = new ArrayList<>();
        char[][] board = new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = '.';
            }
        }
        int[] leftRow = new int[n];
        int[] upperDiagonal = new int[2 * n - 1];
        int[] lowerDiagonal = new int[2 * n - 1];
        solve(0, board, ans, leftRow, upperDiagonal, lowerDiagonal, n);
        printSolutions(ans);
    }

    private static void printSolutions(List<List<String>> sol) {
        for (List<String> board : sol) {
            for (String row : board) {
                System.out.println(row);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /// System.out.print("Enter the value of n for N-Queens problem: ");
        int n = sc.nextInt();
        solveNQueens(n);
    }
}
