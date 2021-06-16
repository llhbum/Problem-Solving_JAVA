package Baekjoon;

import java.util.Scanner;

public class 분산처리 {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        while (T -- > 0){
            int a = scan.nextInt();
            int b = scan.nextInt();
            int r = 1;
            for(int i = 0 ; i < b; i++){
                r = a * r % 10;
            }
            if(r == 0) r = 10;
            System.out.println(r);
        }
    }
}
