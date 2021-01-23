package Programmers.Lv2;



public class JadenCase문자열만들기 {
    public String solution(String s) {

        String answer = "";

        // 문자열의 0번째 문자 처리
        if(Character.isLetter(s.charAt(0)) && s.charAt(0) != ' '){  // 문자이거나 공백이 아니면 대문자 처리
            answer += s.substring(0,1).toUpperCase();
        }else if(s.charAt(0) == ' '  || Character.isDigit(s.charAt(0))){ // 공백이거나 숫자면 그대로 합치기
            answer += s.substring(0,1);
        }

        // 1번쨰 문자부터 그 전 문자와 조합하여 공백, 대문자, 소문자 처리
        for(int i = 1; i<s.length(); i++){

            char c_0 = s.charAt(i-1);
            char c = s.charAt(i);

            //공백
            if(c == ' '){ // 공백이면 그대로 합치기
                answer += s.substring(i,i+1);
            // 대문자
            }else if((Character.isLetter(c) || Character.isDigit(c)) && c_0== ' '){ // 현재 문자가 문자 or (현재문자가 숫자이거나 and 전 문자가 공백) 이면 대문자 처리
                answer += s.substring(i,i+1).toUpperCase();
            // 소문자
            }else if( (Character.isLetter(c_0) || Character.isDigit(c_0)) && Character.isLetter(c)){ // (전 문자가 문자 or 전 문자가 숫자) and 현재 문자가 문자이면 소문자 처리
                answer += s.substring(i,i+1).toLowerCase();
            }
        }
        return answer;
    }
}
