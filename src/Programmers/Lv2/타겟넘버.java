package Programmers.Lv2;

public class 타겟넘버 {
    static int answer = 0;

    public int solution(int[] numbers, int target) {
        dfs(numbers,target,0);
        return answer;
    }
    public static void dfs(int[] numbers, int target, int node){
        if(node == numbers.length){
            int sum = 0;
            for(int num : numbers){
                sum += num;
            }
            if (sum == target){
                answer++;
            }
        }else {
            numbers[node] *= 1;
            dfs(numbers,target,node+1);

            numbers[node] *= -1;
            dfs(numbers,target,node+1);
        }
    }
}
