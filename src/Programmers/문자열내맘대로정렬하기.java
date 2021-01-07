package Programmers;

import java.util.Arrays;

public class 문자열내맘대로정렬하기 {
    public String[] solution(String[] strings, int n) {

        for(int i = 0; i < strings.length; i ++){
            strings[i] = strings[i].charAt(n) + strings[i];
        }
        Arrays.sort(strings);
        String[] ans = new String[strings.length];
        for (int i = 0 ; i < strings.length; i++){
            strings[i] = strings[i].substring(1,strings[i].length());
        }
        ans = strings;
        return ans;
    }
}
