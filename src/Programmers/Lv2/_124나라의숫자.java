package Programmers.Lv2;

public class _124나라의숫자 {
    public String solution(int n) {
        String answer = "";
        String[] s = {"4","1","2"};
        int x = 0;
        while(n > 0){
            x = n % 3;
            n /= 3;
            if(x == 0){
                n--;
            }
            answer = s[x] + answer;
        }
        return answer;
    }


}
