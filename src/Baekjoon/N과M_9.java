package Baekjoon;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class N과M_9 {
    static int N;
    static int M;
    static int[] arr;
    static boolean[] visited;
    static int[] inputArr;
    static LinkedHashSet<String> ans;

    public static void dfs( int depth){
        if(depth == M){
            StringBuilder sb = new StringBuilder();
            for(int i : arr){
                sb.append(i).append(' ');
            }
            ans.add(sb.toString());
            return;
        }
        for(int i = 0; i< inputArr.length; i++){
            if(visited[i] == false ){
                visited[i] = true;
                arr[depth] = inputArr[i];
                dfs(depth+1);
                visited[i] = false;
            }
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
        ans = new LinkedHashSet<>();

        dfs(0);
        ans.forEach(System.out::println);
        scan.close();
    }
}
