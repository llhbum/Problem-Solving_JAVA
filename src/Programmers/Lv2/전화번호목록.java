package Programmers.Lv2;

public class 전화번호목록 {

    public static boolean solution(String[] phone_book) {
        boolean answer = true;

        for(int i = 0; i < phone_book.length;i++){
            for(int j = 0; j< phone_book.length; j++){
                if(i == j){
                    continue;
                }
                if(phone_book[i].equals(phone_book[j])){
                    return false;
                }
                if(phone_book[i].length() <= phone_book[j].length()){
                    if(phone_book[i].equals(phone_book[j].substring(0,phone_book[i].length()))){
                        return false;
                    }
                }
            }
        }
        return answer;
    }
}
