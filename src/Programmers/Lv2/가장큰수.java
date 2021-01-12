package Programmers.Lv2;

import java.util.Arrays;
import java.util.Comparator;

public class 가장큰수 {
    public String solution(int[] numbers) {
        String answer = "";

        String[] sarr = new String[numbers.length];
        for(int i = 0; i < sarr.length; i++){
            sarr[i] = String.valueOf(numbers[i]);
        }

        Arrays.sort(sarr, new Comparator<String>() {
            @Override
            public int compare(String str1, String str2) {
                return (str2 + str1).compareTo(str1 + str2);
            }
        });

        return sarr[0].equals("0") ? sarr[0] : String.join("", sarr);
    }

}
