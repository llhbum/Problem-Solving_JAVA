package Programmers.Lv2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class 위장 {
    public static int solution(String[][] clothes) {
        int answer = 1;
        HashMap<String, Integer> map = new HashMap<>();

        for(int i = 0; i<clothes.length;i++){
            String key = clothes[i][1];
            if(map.containsKey(clothes[i][1])){
                map.put(clothes[i][1] , map.get(clothes[i][1]) + 1);
            }else{
                map.put(clothes[i][1], 1);
            }

        }
        for(String s : map.keySet()){
            answer *= map.get(s) + 1;
        }
        return answer-1;
    }

}
