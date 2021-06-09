package Baekjoon;

import java.util.Scanner;

public class N과M_2 {

    static int arr[];
    static boolean visited[];
    static int N;
    static int M;
    static StringBuilder sb = new StringBuilder();

    public static void dfs(int at, int depth){
        if(depth == M){
            for (int i : arr){
                sb.append(i + " ");
            }
            sb.append("\n");
            return;
        }


            for(int i = at; i<=N; i++){
                if(visited[i] == false){
                    arr[depth] = i;
                    dfs(i+1,depth+1);
                }
            }

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        N = scan.nextInt();
        M = scan.nextInt();
        arr = new int[M];
        visited = new boolean[N+1];

        dfs(1,0);
        System.out.println(sb);
        scan.close();
    }
}
