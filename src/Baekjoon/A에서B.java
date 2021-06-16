package Baekjoon;

import java.io.*;
import java.util.*;

public class A에서B { // A -> B

    public static void main(String[] args) throws IOException{
        // TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);

        int A = scanner.nextInt();
        int B = scanner.nextInt();

        int K = 0;
        while(true) {
            if(B == A) {
                K += 1;
                break;
            }
            if(B < A) {
                K = -1;
                break;
            }

            if(B % 10 == 1)
                B /= 10;
            else if(B % 2 == 0)
                B /= 2;
            else {
                K = -1;
                break;
            }

            K++;
        }
        System.out.println(K);


    }

}
