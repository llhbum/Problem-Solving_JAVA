package Programmers;

import java.util.stream.IntStream;

public class 핸드폰번호가리기 {
    public StringBuilder solution(String phone_number) {

        StringBuilder p = new StringBuilder(phone_number);


        for(int i = 0 ; i <p.length(); i++){
            if(!(i == p.length() - 1 || i == p.length() -2 || i == p.length() -3 || i == p.length()-4)){
                p.setCharAt(i, '*');
            }
        }


        return p;

    }


}
