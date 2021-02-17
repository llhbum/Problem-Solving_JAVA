package Algo_lecture;

public class 가장큰정사각형잦기 {
    public int solution(int[][] board) {
        int[][] dp = new int[1001][1001];

        int ans = 0;
        int row = board.length;
        int col = board[0].length;

        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= col; j++) {
                if (board[i - 1][j - 1] != 0) {
                    dp[i][j] = Math.min(dp[i][j - 1], Math.min(dp[i - 1][j], dp[i - 1][j - 1])) + 1;
                    ans = Math.max(ans, dp[i][j]);
                }
            }
        }
        return ans * ans;
    }
}



