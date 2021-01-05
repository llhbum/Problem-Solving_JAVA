package Programmers;

import java.lang.reflect.Array;
import java.util.Arrays;

public class 완주하지못한선수 {
    static public String solution(String[] participant, String[] completion) {
        Arrays.sort(participant);
        Arrays.sort(completion);


        for (int i = 0; i < completion.length; i++){
            if (!participant[i].equals(completion[i])){
                return participant[i];
            }
        }
        return participant[participant.length-1];
    }

    public static void main(String[] args) {
        String[] par = {"leo", "kiki", "eden"};
        String[] com = {"eden", "kiki"};

        Arrays.sort(par);
        Arrays.sort(com);

        for (int i = 0; i < com.length; i++){
            if(par[i].equals(com[i])){

            }
        }




        System.out.println(solution(par, com));
    }
}
