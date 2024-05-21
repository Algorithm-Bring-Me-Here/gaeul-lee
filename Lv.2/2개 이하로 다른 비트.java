import java.util.*;
class Solution {
    public long[] solution(long[] numbers) {
        long[] answer = new long[numbers.length];
        for(int i=0; i<numbers.length; i++){
            // f(짝수) = 짝수+1
            if(numbers[i] % 2 == 0) {
                answer[i] = numbers[i]+1;
            }
            // 홀수인 경우 
            else {
                // 2진수로 변환
                String str = Long.toString(numbers[i], 2);
                int zeroIdx = str.lastIndexOf("0");
                
                // 0과 1이 섞여있는 경우 -> 01을 10으로 바꿔주기 ex) 1011 -> 1101 
                if(zeroIdx != -1) {
                    str = str.substring(0, zeroIdx) + "10" + str.substring(zeroIdx+2, str.length());
                }
                
                // 다 1인 경우 -> 맨 왼쪽 1을 10으로 바꿔주기 ex) 111 -> 1011
                else {
                    str = "10" + str.substring(1, str.length());
                }
                
                // 2진수를 10진수로 변환
                answer[i] = Long.parseLong(str, 2);
            }
            
        }
        return answer;
    }

}

// 원래 풀이: XOR 연산과 bitCount 함수 이용 -> 시간 초과
/*
 while(true) {
    if(Long.bitCount(numbers[i]^num) <= 2) {
        answer[i] = num;
        break;
    } else {
        num++;
    }
 }
*/
