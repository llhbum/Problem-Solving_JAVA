package Baekjoon;
import java.util.Queue;
import java.util.Scanner;

public class TestScan {

    static int N;
    static int[][] OriginalMap;
    static boolean[][] OriginalVisited;

    static int[] dx;
    static int[] dy;

    static Queue<q_class> q;

    static class q_class{
        int x;
        int y;

        q_class(int x, int y){
            this.x = x;
            this.y = y;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        N = scan.nextInt();
        OriginalMap = new int[N][N];
        for(int i = 0; i<N; i++){
            for(int j =0; j<N; j++){
                int temp = scan.nextInt();
                OriginalMap[i][j] = temp;
            }
        }

        for(int i = 0; i<N; i++){
            for(int j =0; j<N; j++){
                System.out.print(OriginalMap[i][j]);
            }
            System.out.println();
        }

    }


}
