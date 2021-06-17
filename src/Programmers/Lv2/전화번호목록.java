package Programmers.Lv2;

import java.util.*;
public class 전화번호목록 {
    public boolean solution(String[] phone_book) {        
        HashMap<String, Integer> hm = new HashMap<>();
        
        for(int i = 0; i <phone_book.length; i++) hm.put(phone_book[i],0);
        
        for(String key : hm.keySet()){
            for(int i = 1; i<key.length(); i++){
                if(hm.containsKey(key.substring(0,i))) return false;
            }
        }
        return true;
    }
}
