package Programmers.Lv2;

public class 다음큰숫자 {
    public int solution(int n) {
        int answer = 0;
        return answer;

    }

    public static void main(String[] args) {
        int n = 15;
        int bitCnt = Integer.bitCount(n);
        int ans = 0;
        for(;;){
            n++;
            if(bitCnt == Integer.bitCount(n)){
                ans=n;
                break;
            }
        }
        System.out.println(ans);
    }
}
