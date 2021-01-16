package Programmers.Lv2;

import java.util.Arrays;
public class 조이스틱 {
    public int solution(String name) {
        int cnt = 0;
        //0. 문자 배열 만들기
        char[] nameList = new char[name.length()];

        for(int i= 0; i < name.length(); i++){
            nameList[i] = name.charAt(i);
        }
        // 1. 알파벳 배열 만들기
        char[] alp = new char[26];
        for(int i = 0; i < alp.length; i ++){
            alp[i] = (char)(65+i);
        }

        // 2. 상하 움직임 조작
        for(int i = 0; i < nameList.length; i++){
            int tempUDCnt = Arrays.binarySearch(alp,nameList[i]);

            if (tempUDCnt <= 13){
                cnt += tempUDCnt;
            }else {
                cnt += alp.length - tempUDCnt;
            }
        }

        // 3. 좌우 움직임 조작
        int minMove = name.length() - 1;
        for(int i = 0; i < name.length(); i++) {
            if(name.charAt(i) != 'A') {
                int next = i+1; // next: i 이후에 처음으로 나오는 A가 아닌 문자
                while(next < name.length() && name.charAt(next) == 'A') {
                    next++;
                }
                // 오른쪽으로 먼저 이동할 경우
                int rightMove = 2 * i + name.length() - next;

                // 왼쪽으로 먼저 이동할 경우
                int leftMove = 2 * (name.length()-next) + i;

                minMove = Math.min(rightMove, Math.min(leftMove, minMove));
            }
        }
        return cnt + minMove;
    }
}
