package Programmers.Lv2;

public class 카펫 {
    public int[] solution(int brown, int yellow) {
        //가로 세로로 answer 출력
        int[] answer = new int[2];
        // total = 넓이
        int total = brown + yellow;

        //i = 세로
        // (total / i) = 가로
        for(int i = 3; i<total; i++){
            // 세가지 조건을 만족하는 가로, 세로 찾기
            // 1. 가로*세로 = 넓이(total)
            // 2. 가로의 값은 세로와 같거나 커야한다.
            // 3. (가로-2)*(세로-2) = yellow 여야한다.
            if(i * (total/i) == total && i<=(total/i) && ((total/i) - 2) * (i-2) == yellow){
                answer[0] = total/i;
                answer[1] = i;
                break;
            }
        }
        return answer;
    }
}
