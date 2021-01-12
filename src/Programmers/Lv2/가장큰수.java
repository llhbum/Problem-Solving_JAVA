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
            public int compare(String o1, String o2) {
                return (o1 + o2).compareTo(o1+o2);
            }
        });

        return sarr[0].equals("0") ? sarr[0] : String.join("", sarr);
    }

}
