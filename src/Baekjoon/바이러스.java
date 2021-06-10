package Baekjoon;

import java.util.Scanner;

public class 바이러스 {
    static int N;
    static int V;
    static int[][] G;
    static boolean[] visited;
    static int virusedCom = 0;

    public static void dfs(int count){
        visited[count] = true;
        for(int i = 1; i<visited.length;i++){
            if(visited[i] == false && G[count][i] == 1){
                visited[i] = true;
                virusedCom += 1;
                dfs(i);
            }
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        N = scan.nextInt();
        V = scan.nextInt();

        visited = new boolean[N+1];
        G = new int[N+1][N+1];

        for(int i = 1; i <=V; i++){
            int startCom = scan.nextInt();
            int endCom = scan.nextInt();

            G[startCom][endCom] = 1;
            G[endCom][startCom] = 1;
        }

        dfs(1);
        System.out.println(virusedCom);
    }

}
