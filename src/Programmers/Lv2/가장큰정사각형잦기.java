package Programmers.Lv2;

public class 가장큰정사각형잦기 {
    public int solution(int[][] board){

        int up, left, upleft; // 상단, 좌측, 좌측상단 변수설정

        // [1,1] 부터 탐색 -> if문을 위해서 [1,1]부터 수행
        for(int y = 1; y< board.length; y++){
            for(int x = 1; x < board[y].length; x++){
                // 만약 1이면
                if(board[y][x] == 1){
                    // 상단, 좌측, 좌상단의 값을 변수에 넣어줌
                    up = board[y-1][x];
                    left = board[y][x-1];
                    upleft = board[y-1][x-1];

                    // 좌, 상, 좌상 중 min 값을 찾아줌
                    int min = Math.min(up,Math.min(left,upleft));
                    // min + 1을 대입
                    board[y][x] = min + 1;
                }
            }
        }

        // board에서 가장 큰값 찾아서 제곱해서 return
        int ans = 0;
        for(int y = 0; y < board.length; y++){
            for(int x = 0; x < board[0].length; x++){
                if(board[y][x] > 0){
                    ans = Math.max(ans, board[y][x]);
                }
            }
        }
        return ans * ans;
    }
}
