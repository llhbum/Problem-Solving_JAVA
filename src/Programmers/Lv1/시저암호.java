package Programmers.Lv1;


import java.util.ArrayList;

public class 시저암호 {
    public String solution(String s, int n) {
        String answer = "";

        //알파벳 배열 생성
        ArrayList<Character> Upper_alp = new ArrayList<>();
        ArrayList<Character> Lower_alp = new ArrayList<>();

        for (int i = 0; i < 26; i++){
            Upper_alp.add((char)(65+i));
            Lower_alp.add((char)(97+i));
        }

        for(int i = 0; i < s.length(); i++){
            char temp = s.charAt(i);
            if(Upper_alp.contains(temp)){
                int loc = Upper_alp.indexOf(temp);
                if(loc + n > Upper_alp.size() - 1){
                    loc = (loc + n)- Upper_alp.size();
                }else {
                    loc = loc + n;
                }
                answer += Upper_alp.get(loc);
            }else if(Lower_alp.contains(temp)) {
                if (Lower_alp.contains(temp)) {
                    int loc = Lower_alp.indexOf(temp);
                    if (loc + n > Lower_alp.size() - 1) {
                        loc = (loc + n) - Lower_alp.size();
                    } else {
                        loc = loc + n;
                    }
                    answer += Lower_alp.get(loc) ;
                }

            }else {
                answer+= " ";
            }
        }
        return answer;
    }
}
