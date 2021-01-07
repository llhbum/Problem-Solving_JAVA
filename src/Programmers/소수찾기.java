package Programmers;

public class 소수찾기 {
    public int solution(int n) {

        int ans = 0;
        boolean[] chk = new boolean[n + 1];
        for (int i = 2; i <= n; i++) {
            if (!chk[i]) {
                ans++;
            }

            for (int j = i; j <= n; j += i) {
                if (!chk[j]) {
                    chk[j] = true;
                }
            }
        }
        return ans;
    }
}
