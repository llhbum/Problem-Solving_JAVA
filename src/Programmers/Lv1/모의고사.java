package Programmers.Lv1;

import java.util.ArrayList;

public class 모의고사 {
    public ArrayList<Integer> solution(int[] answers) {
        int[] num1 = {1, 2, 3, 4, 5};
        int[] num2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] num3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        int[] temp = new int[3];
        for(int i = 0; i < answers.length; i++){
            if (answers[i] == num1[i % num1.length]){ temp[0] ++; }
            if (answers[i] == num2[i % num2.length]){ temp[1] ++; }
            if (answers[i] == num3[i % num3.length]){ temp[2] ++; }
        }

        int max = Math.max(temp[0],Math.max(temp[1],temp[2]));
        ArrayList<Integer> answer = new ArrayList<>();
        if(max == temp[0]){answer.add(1);}
        if(max == temp[1]){answer.add(2);}
        if(max == temp[2]){answer.add(3);}



        return answer;
    }

}
