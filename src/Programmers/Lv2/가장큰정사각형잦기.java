package Programmers.Lv2;

public class 가장큰정사각형잦기 {
    public int solution(int [][]board)
    {
        int answer = 1234;

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("Hello Java");

        return answer;
    }

    public static void main(String[] args) {
        int[][] b = {{0, 1, 1, 1},
                {1, 1, 1, 1},
                {1, 1, 1, 1},
                {0, 0, 1, 0}};

        int max = 0;
        int len = 2;
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[i].length; j++) {
                if (b[i][j] == 1) {
                    while (len+i < b.length) {
                        for (int k = i; k < len + i; k++) {
                            if(k < b.length){break;}
                            for (int l = j; l < len + l; l++) {
                                if (b[k][l] == 0) {
                                    break;
                                }
                            }
                            len++;
                        }


                    }
                        if (max < len * len) {
                            max = len * len;
                    }
                }

            }
        }
        System.out.println(max);
    }
}
