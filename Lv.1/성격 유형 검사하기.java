import java.util.*;
class Solution {
    public String solution(String[] survey, int[] choices) {
        StringBuilder answer = new StringBuilder();
        // 성격 유형
        char[] type = {'R','T','C','F','J','M','A','N'};
        
        // 성격 유형 점수를 담을 해시맵
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i=0; i<type.length; i++){
            // 0으로 초기화
            map.put(type[i], 0);
        }
        
        for(int i=0; i<survey.length; i++){
            char left = survey[i].charAt(0); // 왼쪽 유형
            char right = survey[i].charAt(1); // 오른쪽 유형
            
            // 어떤 성격 유형도 점수를 얻지 않는 경우
            if(choices[i] == 4) continue;
            
            // 왼쪽 유형이 더 선호되는 경우
            else if(choices[i] < 4) {
                map.put(left, map.get(left) + (4-choices[i]));
            }
            
            // 오른쪽 유형이 더 선호되는 경우
            else {
                map.put(right, map.get(right) + (choices[i]-4));
            }
        }
        
        for(int i=0; i<type.length; i+=2){
            char left = type[i];
            char right = type[i+1];
            
            // 왼쪽 유형이 더 선호되거나 같을 때 사전순으로 빠른 유형
            if(map.get(left) >= map.get(right)){
                answer.append(left);
            }
            
            // 오른쪽 유형이 더 선호되는 경우
            else answer.append(right);
        }
        
        return answer.toString();
    }
}
