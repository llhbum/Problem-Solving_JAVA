package Programmers.Lv1;

import java.util.*;

public class 완주하지못한선수 {
    static public String solution(String[] participant, String[] completion) {

        Arrays.sort(participant);
        Arrays.sort(completion);

        for(int i = 0 ; i < completion.length; i++){
            if(!participant.equals(completion)){
                return participant[i];
            }
        }
        return participant[participant.length-1];
    }
}
