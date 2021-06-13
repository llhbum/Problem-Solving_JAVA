package Baekjoon;

/*
50미터에 맥주한병 마셔야함
박스 총 병 수 20 -> 0 - 마신것, 1 - 마시지않은것 으로 나누면 될거같음
편의점 들렸을때 20개중 0을 버리고 1로 채울 수 있음
편의점 상근이네, 페스트벌 좌표가 주어짐
 */

import java.util.*;

public class 맥주마시면서걸어가기 {

    public static class Point {
        int x;
        int y;

        Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt() + 2;
            int max = 102;
            int[][] d = new int[max][max];
            ArrayList<Point> pos = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                pos.add(new Point(sc.nextInt(), sc.nextInt()));
            }

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (i != j)
                        d[i][j] = max;
                }
            }

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (i == j) {
                        continue;
                    }
                    Point v = pos.get(i);
                    Point next = pos.get(j);

                    int distance = Math.abs(v.x - next.x) + Math.abs(v.y - next.y);

                    if (distance <= 1000) {
                        d[i][j] = 1;
                    }
                }
            }

            floyd(d, n);

            n -= 2;
            if (0 < d[0][n + 1] && d[0][n + 1] < max) {
                System.out.println("happy");
            } else {
                System.out.println("sad");
            }
        }


    }

    public static void floyd(int[][] d, int n) {
        // 거쳐가는 노드
        for (int k = 0; k < n; ++k) {
            // 출발노드
            for (int i = 0; i < n; ++i) {
                // 도착노드
                for (int j = 0; j < n; ++j) {
                    if (d[i][j] > d[i][k] + d[k][j]) {
                        d[i][j] = d[i][k] + d[k][j];
                    }
                }
            }
        }
    }

}
