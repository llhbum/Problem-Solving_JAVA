package Baekjoon;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 트리의부모찾기BFS {
    static ArrayList<ArrayList<Integer>> map;
    static int N;
    static Queue<Integer> q;
    static int start = 1;
    static int[] parents;

    public static void bfs(){
        q.add(start);
        parents[start] = 1;

        while (!q.isEmpty()){
            int p = q.poll();

            for(int i : map.get(p)){
                if(parents[i] == 0){
                    parents[i] = p;
                    q.add(i);
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        N = scan.nextInt();
        map = new ArrayList<>();
        q = new LinkedList<>();

        parents = new int[N+1];
        for(int i = 0; i<=N+1;i++ ){
            map.add(new ArrayList<Integer>());
        }

        for(int i = 1 ; i <N; i++){
            int temp1 = scan.nextInt();
            int temp2 = scan.nextInt();

            map.get(temp1).add(temp2);
            map.get(temp2).add(temp1);
        }
        bfs();

        for(int i = 2; i<parents.length; i++){
            System.out.println(parents[i]);
        }

    }
}
