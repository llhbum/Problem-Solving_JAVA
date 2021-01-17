package Programmers.Lv2;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class 구명보트 {
    public int solution(int[] people, int limit) {
        Arrays.sort(people);
        int answer = 0;
        int index = people.length - 1;
        for (int i = 0; i <= index; i++, answer++) {
            while (index > i && people[i] + people[index--] > limit) {
                answer++;
            }

        }
        return answer;
    }

}
