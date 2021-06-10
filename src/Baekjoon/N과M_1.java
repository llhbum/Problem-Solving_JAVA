package Baekjoon;


import java.util.Scanner;

/*
https://st-lab.tistory.com/114
 */
public class N과M_1 {
    static int arr[];
    static boolean visit[];
    static int N;
    static int M;
    static StringBuilder sb = new StringBuilder();


    public static void dfs(int d){
        if(d == M){
            for(int i : arr){
                sb.append(i+ " ");
            }
            sb.append("\n");
            return;
        }

        for(int i = 1; i <= N; i++){
            if(visit[i] == false){
                System.out.println();
                visit[i] = true;
                arr[d] = i;
                dfs(d + 1);
                visit[i] = false;

            }
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        N = scan.nextInt();
        M = scan.nextInt();
        arr = new int[M];
        visit = new boolean[N+1];
        dfs(0);
        System.out.println(sb);
        scan.close();
    }
}
