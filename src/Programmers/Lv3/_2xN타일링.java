package Programmers.Lv3;

public class _2xN타일링 {
    public static int solution(int n) {
        int case1 = 1;
        int case2 = 1;
        for(int i = 0; i < n-1; i++){
            int case3 = (case1+case2) % 1000000007;
            case1 = case2;
            case2 = case3;
        }
        return case2;
    }
}

/*
https://deveric.tistory.com/61
 */
