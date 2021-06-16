package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.Stack;

public class 스택 {
    static Stack<Integer> stack;

    public static void main(String[] args) throws IOException {

//        Scanner scan = new Scanner(System.in);
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        stack = new Stack<>();
        int T = Integer.parseInt(bf.readLine());


        for(int i = 0 ; i< T; i++){
//            String s = scan.next();
            String[] s = bf.readLine().split(" ");

//            System.out.println(s);
            if(s[0].equals("push")){
//                int num = scan.nextInt();
                int num = Integer.parseInt(s[1]);
                stack.push(num);

            }else if(s[0].equals("pop") ){
                if(stack.isEmpty()){
                    System.out.println(-1);
                }else {
                    System.out.println(stack.pop());
                }

            }else if(s[0].equals("size") ){
                System.out.println(stack.size());

            }else if(s[0].equals("empty")){
                if(stack.isEmpty()){
                    System.out.println(1);
                }else {
                    System.out.println(0);
                }

            }else if(s[0].equals("top") ){
                if(stack.isEmpty()){
                    System.out.println(-1);
                }else {
                    System.out.println(stack.get(stack.size()-1));
                }
            }
        }
    }

}
