package Baekjoon;

import java.util.*;

public class DFS와BFS {

    static int N;
    static int M;
    static int startNode;
    static int[][] graph;
    static int[] arr;
    static boolean[] visited;
    static StringBuilder sb;

    public static void dfs(int startNode){
        sb.append(startNode+ " ");
        visited[startNode] = true;
        for(int i = 1; i < N+1; i++){
            if( i != startNode && !visited[i] && graph[startNode][i] == 1){
                dfs(i);
            }
        }
    }

    public static void bfs(int startNode){
        Queue<Integer> q = new LinkedList<>();
        q.add(startNode);
        visited[startNode] = true;
        while(!q.isEmpty()){
            int x = q.poll();
            sb.append(x+" ");
            for(int i = 1 ; i < N+1; i++){
                if(i != x && !visited[i] && graph[x][i] == 1){
                    q.add(i);
                    visited[i] = true;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        N = scan.nextInt();
        M = scan.nextInt();
        startNode = scan.nextInt();

        graph = new int[1001][1001];

        for(int i = 0; i<M; i++){
            int node1 = scan.nextInt();
            int node2 = scan.nextInt();
            graph[node1][node2] = 1;
            graph[node2][node1] = 1;
        }
        visited = new boolean[N+1];
        sb = new StringBuilder();
        dfs(startNode);
        System.out.println(sb);

        visited = new boolean[N+1];
        sb = new StringBuilder();
        bfs(startNode);
        System.out.println(sb);
    }
}
