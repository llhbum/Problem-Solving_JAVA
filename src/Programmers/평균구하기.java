package Programmers;

import java.util.Arrays;

public class 평균구하기 {
    public double solution(int[] arr) {
        double answer = 0;
        int sum = Arrays.stream(arr).sum();
        int len = arr.length;

        return (double) sum/len;

    }
}
