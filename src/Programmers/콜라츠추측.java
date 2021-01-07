package Programmers;

public class 콜라츠추측 {
    public int solution(int num) {
        long temp = num;
        int cnt = 0;
        if (num == 1){
            return 0;
        }

        for (int i = 0; i < 300; i++) {
            if(temp % 2 == 0){
                temp = temp/2;
                cnt ++;
            }else{
                temp = (temp * 3) + 1;
                cnt ++;
            }

            if(temp == 1){
                return cnt;
            }
        }
        return -1;
    }
}
