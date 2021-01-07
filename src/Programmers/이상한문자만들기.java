package Programmers;

import java.util.ArrayList;
import java.util.Locale;

public class 이상한문자만들기 {
    public String solution(String s) {
        String ans = "";

        String[] sList = s.split("");
        String space = " ";
        int cnt = 0;

        for(int i =0; i< sList.length; i++){
            if(sList[i].equals(space)){
                cnt = 0;
            }else {
                if(cnt % 2 == 0){
                    cnt ++;
                    sList[i] = sList[i].toUpperCase();
                }else {
                    cnt ++;
                    sList[i] = sList[i].toLowerCase();
                }
            }
            ans += sList[i];
        }
        return ans;
    }
}
