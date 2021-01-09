package Programmers.Lv2;

import java.lang.reflect.Array;
import java.util.*;
import java.util.concurrent.ConcurrentLinkedDeque;

public class 다리를지나는트럭 {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int time = 0;
        int sum = 0;
        Queue<Integer> bridge = new ConcurrentLinkedDeque<>();

        for( int t : truck_weights){
            while (true){
                if(bridge.isEmpty()){ //다리에 트럭이 한대도 없으면
                    bridge.add(t); //한대를 보내고
                    sum += t; // 다리위 트럭무게를 갱신하고
                    time++; // 시간을 갱신한다.
                    break; //while문 break

                }else if(bridge.size() == bridge_length){ // 다리위 트럭 개수와 다리 길이가 같으면
                    sum = sum - bridge.poll(); // 다리에서 트럭을 한대 빼내고 다리위 트럭 무게를 갱신한다.

                }else { // 다리위에 트럭이 움직이는 중
                    if(sum + t <= weight){ // 다음 트럭이 갈수 있으면
                        bridge.add(t); // 다리로 트럭을 보내고
                        sum += t; // 다리위 트럭무게 갱신
                        time ++; // 시간 갱신
                        break; // while문 break

                    }else { // 다리위 트럭이 갈 수 없으면
                        time ++; // 시간을 더해주고
                        bridge.add(0); // 무게 0 트럭(?)을 보냄
                    }
                }
            }
        }
        return time + bridge_length; // 다리 위 트럭이 지나가는 시간 + 시간

    }
}
