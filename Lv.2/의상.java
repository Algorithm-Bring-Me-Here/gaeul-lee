import java.util.*;
class Solution {
    public int solution(String[][] clothes) {
        int answer = 1;
        HashMap<String,Integer> map = new HashMap<>();
        for(String c[] : clothes){
            //c[1] == 종류 == key
            map.put(c[1], map.getOrDefault(c[1], 0)+1);
        }
        for(String s : map.keySet()){
            answer *= map.get(s)+1;
        }
        return answer-1;
    }
}
