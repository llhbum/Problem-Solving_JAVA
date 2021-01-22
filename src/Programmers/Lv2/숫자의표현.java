package Programmers.Lv2;

public class 숫자의표현 {
    public int solution(int n) {
        int answer = 0;
        int target = 0;
        for(int i = 0; i<=n; i++){
            target = 0;
            for(int j = i+1; j <= n; j++){
                target += j;
                if(target == n){
                    answer++;
                    break;
                }else if(target > n){
                    break;
                }
            }
        }
        return answer;
    }
}
