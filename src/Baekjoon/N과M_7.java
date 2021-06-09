package Baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class N과M_7 {
    static int N;
    static int M;
    static int[] arr;
    static boolean[] visited;
    static int[] inputArr;
    static StringBuilder sb = new StringBuilder();

    public static void dfs(int depth){
        if(depth == M){
            for(int i : arr){
                sb.append(i + " ");
            }
            sb.append("\n");
            return;
        }
        for(int i = 0; i< inputArr.length; i++){
                arr[depth] = inputArr[i];
                dfs(depth+1);
        }
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        N = scan.nextInt();
        M = scan.nextInt();
        inputArr = new int[N];

        for(int i = 0; i<N; i++){
            inputArr[i] = scan.nextInt();
        }
        Arrays.sort(inputArr);

        arr = new int[M];
        visited = new boolean[N+1];

        dfs(0);
        System.out.println(sb);

        scan.close();
    }
}
