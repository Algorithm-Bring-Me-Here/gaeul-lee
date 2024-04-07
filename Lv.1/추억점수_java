import java.util.*;
class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        HashMap<String, Integer> map = new HashMap<>();
        // 이름과 그리움점수를 해시맵에 담는다
        for(int i=0; i<name.length; i++){
            map.put(name[i], yearning[i]);
        }
        
        int[] answer = new int[photo.length];
        for(int i=0; i<photo.length; i++){
            int sum = 0;
            for(int j=0; j<photo[i].length; j++){
                String idx = photo[i][j];
                // 해당 이름이 맵의 키에 있는 경우
                if(map.containsKey(idx)){
                    sum += map.get(idx);
                }
            }
            answer[i] = sum;
        }
        return answer;
    }
}
