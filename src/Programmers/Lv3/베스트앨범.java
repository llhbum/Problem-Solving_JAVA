package Programmers.Lv3;

import java.util.*;
class 베스트앨범 {
    static class info{
            int idx;
            String title;
            int plays;

            public info(int idx, String title, int plays){
            this.idx = idx;
            this.title = title;
            this.plays = plays;
    }
    }
    public static Map solution(String[] genres, int[] plays) {
//        List<info> list = new LinkedList<>();
        Map<int[], String> hm = new HashMap<>();
        Map<String, Integer> hm2 = new TreeMap<>(Collections.reverseOrder());

        int[] arr;

        for(int i = 0 ; i < plays.length; i++){
            arr = new int[2];
            arr[0] = i;
            arr[1] = plays[i];
            hm.put(arr, genres[i]);
        }
         List<Map.Entry<int[], String>> list = new LinkedList<>(hm.entrySet());

         Collections.sort(list, new Comparator<Map.Entry<int[], String>>(){
             @Override
             public int compare(Map.Entry<int[], String> o1, Map.Entry<int[], String> o2) {
                 if (o1.getKey()[1] > o2.getKey()[1]){
                     return 1;
                 }else if(o1.getKey()[1] < o2.getKey()[1]){
                     return -1;
                 }
                 return o2.getValue().compareTo(o1.getValue());
             }
         });
        int[] answer = {};

        for(int i = 0; i<plays.length; i++){
            if(!hm2.containsKey(genres[i])){
                hm2.put(genres[i], plays[i]);
            }else{
                hm2.put(genres[i], hm2.get(genres[i]) + plays[i]);
            }

        }

        Set<String> ss = hm2.keySet();
        for(String set : ss){

        }

        return hm;
    }

    public static void main(String[] args) {
        String[] genres = new String[]{"classic", "pop", "classic", "classic", "pop"};
        int[] plays = new int[]{500, 600, 150, 800, 2500};


        System.out.println(solution(genres, plays));
    }
}