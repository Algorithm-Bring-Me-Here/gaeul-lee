import java.util.*;
class Solution {
    public static String words[] = {"aya", "ye", "woo", "ma"}; // 네 가지 발음
    public static String doublewords[] = {"ayaaya", "yeye", "woowoo", "mama"}; // 연속된 발음
    
    public int solution(String[] babbling) {
        int answer = 0;
        
        for(String bb : babbling){
            // 연속된 문자열이 없을 경우
            if(!isDoubleWord(bb)){
                for(String word : words){
                    // replaceAll()로 해당 문자를 " "으로 치환
                    bb = bb.replaceAll(word, " ");
                }
                // " "인 문자를 ""로 치환 후 남은 문자가 없다면 answer값 1증가
                if(bb.replaceAll(" ", "").equals("")) answer++;
            }
            
        }
        return answer;
    }
    
    private boolean isDoubleWord(String bb){
        for(String w : doublewords){
            // 해당 문자열에 연속된 문자열이 있는 경우 true 반환
            if(bb.contains(w)) return true;
        }
        return false;
    }
}
