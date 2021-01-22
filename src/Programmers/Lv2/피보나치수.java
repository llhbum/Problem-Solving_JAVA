package Programmers.Lv2;

public class 피보나치수 {
    public int solution(int n) {
        int ans = 0;
        int a = 0; int b = 1;
        for(int i = 0; i<n; i++){
            int c = (a+b) % 1234567;
            a = b % 1234567;
            b = c % 1234567;
        }
        return a;
    }
}
