package Programmers.Lv2;

public class 행렬의곱셈 {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = new int[arr1.length][arr2[0].length];

        for(int i = 0; i<arr1.length; i++){
            for (int j = 0; j < arr1[i].length; j++){

            }
        }

        return answer;
    }

    public static void main(String[] args) {
       int[][] arr1 = {{1,4},
                   {3,2},
                   {4,1}};

        for(int i = 0; i<arr1[0].length; i++){
            for (int j = 0; j < arr1.length; j++){
                System.out.println(arr1[j][i]);
            }
            System.out.println();
        }

    }
}
