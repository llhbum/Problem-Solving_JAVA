package Baekjoon;

import java.util.Scanner;

public class N과M_3 {
    static int N;
    static int M;
    static int[] arr;
    static boolean[] visited;
    static StringBuilder sb = new StringBuilder();


    public static void dfs(int depth){
        if(depth == M){
            for(int i : arr){
                sb.append(i + " ");
            }
            sb.append("\n");
            return;
        }
        for(int i=1; i<=N; i++){
                arr[depth] = i;
                dfs(depth+1);
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        N = scan.nextInt();
        M = scan.nextInt();

        arr = new int[M];
        visited = new boolean[N+1];
        dfs(0);
        System.out.println(sb);
        scan.close();

    }
}
