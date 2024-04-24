import java.util.*;
class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        // 일치하는 개수를 key, 해당 순위를 value로 가지는 해시맵 생성
        HashMap<Integer, Integer> map = new HashMap<>(){{
            put(6,1);
            put(5,2);
            put(4,3);
            put(3,4);
            put(2,5);
            put(1,6);
            put(0,6);
        }};
        int zero_count = 0; // 0 개수
        int count = 0; // 숫자 일치 개수
        for(int i=0; i<lottos.length; i++){
            if(lottos[i] == 0){
                zero_count++;
            }
            else{
                for(int j=0; j< win_nums.length; j++){
                    if(lottos[i] == win_nums[j]) count++;
                }
            }
        }
        answer[0] = map.get(count+zero_count); // 최고 순위
        answer[1] = map.get(count); // 최저 순위
        return answer;
    }
}
