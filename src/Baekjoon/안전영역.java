package Baekjoon;


import java.util.*;

public class 안전영역 {

    static int N;
    static int[][] OriginalMap;
    static int[][] Map;
    static int mapMaxNum;
    static boolean[][] OriginalVisited;
    static boolean[][] Visited;

    static int[] dx;
    static int[] dy;

    static Queue<q_class> q;

    static int safeArea;
    static List safeAreaList = new ArrayList();


    static class q_class{
        int x;
        int y;

        q_class(int x, int y){
            this.x = x;
            this.y = y;
        }
    }
    public static void initMap(){
        Map = new int[N][N];
        for(int i = 0 ; i < N; i ++){
            for(int j =0; j < N; j++){
                Map[i][j] = OriginalMap[i][j];
            }
        }
    }
    public static void initVisited(){
        Visited = new boolean[N][N];
        for(int i = 0 ; i < N; i ++){
            for(int j =0; j < N; j++){
                Visited[i][j] = OriginalVisited[i][j];
            }
        }
    }

    public static void rain(int length){
        for(int i =0; i < N; i++){
            for(int j = 0; j < N; j++){
                if(Map[i][j] <= length){
                    Map[i][j] = 0;
                }
            }
        }
    }

    public static void bfs(){
        for(int i = 0; i <= mapMaxNum; i++){
            initMap();
            initVisited();
            rain(i);

//            for(int i2 =0; i2 < N; i2++){
//                for(int j = 0; j < N; j++){
//                    System.out.print(Map[i2][j]);
//                }
//                System.out.println();
//            }
//            System.out.println();

            safeArea = 0;
            for(int k = 0; k < N; k ++){
                for(int l = 0; l < N; l++){
                    if(Map[k][l] != 0){
                        q.add(new q_class(k,l));
                        while (!q.isEmpty()){
                            q_class qc = q.poll();

                            int x = qc.x;
                            int y = qc.y;
                            Visited[x][y] = true;

                            for(int d = 0; d<dx.length; d++){
                                int nx = x + dx[d];
                                int ny = y + dy[d];

                                if(nx>=0 && ny>=0 && nx<N && ny<N && Visited[nx][ny] == false &&Map[nx][ny] != 0){
                                    Visited[nx][ny] = true;
                                    Map[nx][ny] = 0;
                                    q.add(new q_class(nx,ny));
                                }
                            }
                        }
                        safeArea += 1;
//                        System.out.println(safeArea);
                    }


                }
            }
            safeAreaList.add(safeArea);


        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        N = scan.nextInt();
        OriginalMap = new int[N][N];
        OriginalVisited = new boolean[N][N];
        Map = new int[N][N];
        Visited = new boolean[N][N];
        dx = new int[]{-1,1,0,0};
        dy = new int[]{0,0,-1,1};
        q = new LinkedList<q_class>();

        for(int i = 0; i<N; i++){
            for(int j =0; j<N; j++){
                int temp = scan.nextInt();
                OriginalMap[i][j] = temp;
            }
        }



        //정상출력
        mapMaxNum = 0;
        for(int i = 0; i<N; i++){
            for(int j =0; j<N; j++){
                if(mapMaxNum < OriginalMap[i][j]){
                    mapMaxNum = OriginalMap[i][j];
                }
            }
        }
//        System.out.println(mapMaxNum);

        bfs();

//        System.out.println(safeAreaList.toString());

        System.out.println(Collections.max(safeAreaList));

    }


}
