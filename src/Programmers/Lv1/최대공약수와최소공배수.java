package Programmers.Lv1;

public class 최대공약수와최소공배수 {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];

        int big = Math.max(n,m);
        int small = Math.min(n,m);

        int mok,nmg;

        int minM, maxD;

        while(true){
            mok = big/small;
            nmg = big - mok * small;
            if(nmg == 0){
                maxD = small;
                minM = (n * m) / maxD;
                break;
            }else {
                big = small;
                small = nmg;
            }
        }

        answer[0] = maxD;
        answer[1] = minM;

        return answer;
    }
}
