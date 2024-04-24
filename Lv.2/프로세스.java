import java.util.*;
class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 1;
        // 숫자가 높은 프로세스가 먼저 꺼내지도록 Collections.reverseOrder() 사용
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        
        for(int i=0; i<priorities.length; i++){
            pq.add(priorities[i]);
        }
        
        while(pq.size() > 0){
            for(int i=0; i<priorities.length; i++){
                if(pq.peek() == priorities[i]) {
                    // 숫자도 같고 위치도 같은 경우 answer 리턴
                    if(i == location) return answer;
                    
                    // 숫자는 같은데 위치가 다른 경우 
                    pq.poll();
                    answer++;
                }
            }
            
        }
        return answer;
    }
}

/*
priorities 원소가 내림차순 정렬인데, 숫자가 같을 경우가 관건!
숫자가 같을 경우 priorities 배열의 큰 수 오른쪽에 위치한 수의 우선순위가 높다.
compareTo 함수를 직접 구현하는 것보다는 for문으로 인덱스를 비교하는 방법이 더 효율적이다.
*/
