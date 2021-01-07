package Programmers;

public class 정수제곱근판별 {
    public long solution(long n) {
        double ds = (double)Math.sqrt(n);
        int ints = (int)ds;

        return ds == ints ? (long) Math.pow(ints+1,2) : -1;
    }
}
