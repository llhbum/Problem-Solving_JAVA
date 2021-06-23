package Programmers.Lv2;

import java.util.*;

class 가장큰수 {
    public String solution(int[] numbers) {
        String answer = "";
        String[] sarr = new String[numbers.length];
        for(int i = 0 ; i < numbers.length; i++){
            sarr[i] = String.valueOf(numbers[i]);
        }
        Arrays.sort(sarr, new Comparator<String>(){
            @Override
            public int compare(String s1, String s2){
                return (s2 + s1).compareTo(s1 + s2);
            }
        });

        for(int i = 0 ; i<sarr.length; i++){
            // if(i == 0){
            //     if(sarr[i].equals("0")){
            //         answer += "0";
            //         break;
            //     }else{
            //       answer += sarr[i];   
            //     }
            // }else{
            //    answer += sarr[i]; 
            // }
            answer += sarr[i];

        }
        if(answer.substring(0,1).equals("0")){
            return "0";
        }else{
            return answer;
        }
        // return answer;
    }
}