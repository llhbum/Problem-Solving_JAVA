package Programmers.Lv2;

import java.util.Arrays;
import java.util.Stack;

public class 올바른괄호 {
    boolean solution(String s) {
        boolean ans = true;

        char[] cList = new char[s.length()];
        cList = s.toCharArray();

        Stack<Character> stack = new Stack<>();

        for(int i = 0; i<cList.length; i++){

            if(i == 0 && cList[i] == ')'){
                ans = false;
                return ans;

            }else if(cList[i] == '('){
                stack.push(cList[i]);

            }else{
                if(stack.isEmpty()){
                    ans = false;
                    return ans;
                }

                stack.pop();
            }
        }

        if(stack.isEmpty()){
            return ans;
        }else{
            ans = false;
            return ans;
        }
    }
}
