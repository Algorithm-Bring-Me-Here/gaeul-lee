import java.util.*;
class Solution {
    public String[] solution(String[] record) {
        HashMap<String, String> user = new HashMap<>(); // id, nickname
        int changeCount = 0;
        for(int i=0; i<record.length; i++){
            String[] code = record[i].split(" ");
            
            if(code[0].equals("Leave")) continue;
            else if(code[0].equals("Enter")){
                user.put(code[1], code[2]);
            }
            else{
                user.put(code[1], code[2]);
                changeCount++;
            }
        }
        
        String[] answer = new String[record.length-changeCount];
        int index = 0;
        for(int i=0; i<record.length; i++){
            String[] code = record[i].split(" ");
            String id = code[1];
            String nickname = user.get(id);
            
            if(code[0].equals("Enter")){
                answer[index] = nickname + "님이 들어왔습니다.";
                index++;
            } else if(code[0].equals("Leave")){
                answer[index] = nickname + "님이 나갔습니다.";
                index++;
            }
        }
        return answer;
    }
}
