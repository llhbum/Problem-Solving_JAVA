package Programmers;

import java.util.Arrays;
import java.util.stream.Stream;

public class 하샤드수 {
    public boolean solution(int x) {
        boolean answer = true;
        int[] nList = Stream.of(String.valueOf(x).split("")).mapToInt(Integer::parseInt).toArray();
        int sum = Arrays.stream(nList).sum();

        return (x % sum == 0) ? true : false;

    }
}
