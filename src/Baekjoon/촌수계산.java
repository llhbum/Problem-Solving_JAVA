package Baekjoon;

import java.util.Scanner;

public class 촌수계산 {
    static int N;
    static int target1;
    static int target2;
    static int M;
    static int[][] G;
    StringBuilder sb = new StringBuilder();
    static boolean[] visited;
    static int temp_ans = 0;
    static int ans = 0;

    static int startnode;
    static int endnode;

    public static int dfs(int startnode){
        visited[startnode] = true;
        if(startnode == endnode){
//            System.out.println("끝나야하는데?");
//            System.out.println(temp_ans + " : ans");
             ans = temp_ans;
        }
        for(int i=1; i<visited.length; i++){
//            System.out.println(startnode + " : startnode");
//            System.out.println(i + " : i ");
//            System.out.println(G[startnode][i] + " : G");

            if(visited[i]==false && G[startnode][i]==1){
                visited[i] = true;
                temp_ans+=1;
                dfs(i);
                temp_ans-=1;
                visited[i] = false;
            }
        }
        if(ans!=0){
            return ans;
        }else{
            return -1;
        }
    }



    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        N = scan.nextInt();
        target1 = scan.nextInt();
        target2 = scan.nextInt();
        M = scan.nextInt();
        G = new int[N+1][N+1];
        visited = new boolean[N+1];

        for(int i = 0; i<M; i++){
            int p = scan.nextInt();
            int c = scan.nextInt();
            G[p][c] = 1;
            G[c][p] = 1;
        }

        if(target1 > target2){
            startnode = target2;
            endnode = target1;
        }else {
            startnode = target1;
            endnode = target2;
        }
        System.out.println(dfs(startnode));
//        System.out.println("정상출력");


        // 그래프 정상 입력
//        for(int i = 1; i < G.length; i++){
//            for(int j = 1; j<G[i].length; j++){
//                System.out.print(G[i][j]);
//            }
//            System.out.println();
//        }




    }
}
