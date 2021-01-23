package Programmers.Lv2;

public class 행렬의곱셈 {
    public int[][] solution(int[][] arr1, int[][] arr2) {

        // arr1의 열의 길이와 arr2의 행의 길이가 같아야 곱할 수 있고 결과값은 arr1의 행의 길이와 arr2의 열의 길이가 된다.
        // ex) [3][2] * [2][2] = [3][2] -> 모든 예시 동일 적용
        int[][] answer = new int[arr1.length][arr2[0].length];


        for(int i = 0; i<arr1.length; i++){ // arr1의 행의 길이 만큼 loop
            for (int j = 0; j < arr2[0].length; j++){ // arr2의 열의 길이 만큼 loop
                for(int k = 0; k < arr1[0].length; k++){ // arr1의 열의 길이 만큼 loop
                    answer[i][j] += arr1[i][k] * arr2[k][j]; // 위치에 맞게 answer값 갱신
                }

            }
        }
        return answer;
    }
}
