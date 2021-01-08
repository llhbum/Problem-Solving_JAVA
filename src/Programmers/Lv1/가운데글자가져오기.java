package Programmers.Lv1;

public class 가운데글자가져오기 {
    public String solution(String s) {
        String answer = "";
        int sLen = s.length();

        if(sLen % 2 == 0){
            //짝수
           answer = s.substring(sLen/2 - 1, sLen/2 + 1);
        }
        else{
            //홀수
            answer = s.substring(sLen/2, sLen/2 + 1);
        }

        return answer;
    }

    public static void main(String[] args) {
        String s = "abcde";

        String a = s.substring(2,3);
        System.out.println(a);

    }
}
