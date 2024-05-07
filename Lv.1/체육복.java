import java.util.*;
class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        /* 여분이 있으면 1, 여분이 없으면 0, 도난 당하면 -1
        [n+2]로 두는 이유는 인덱스 비교를 쉽게 하기 위해서 */
        
        int answer = 0;
        int student[] = new int[n+2];
        
        for(int l : lost){
            student[l]--;
        }
        for(int r : reserve){
            student[r]++;
        }
        
        for(int i=1; i<=n; i++){
            if(student[i] == 1) {
                if(student[i-1] == -1){
                    student[i]--;
                    student[i-1]++;
                } else if(student[i+1] == -1){
                    student[i]--;
                    student[i+1]++;
                }
            }
        }
        
        for(int i=1; i<=n; i++){
            if(student[i] >= 0) answer++;
        }
        return answer;
    }
}
