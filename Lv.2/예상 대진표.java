class Solution
{
    public int solution(int n, int a, int b)
    {
        // 홀수가 배정받는 번호 = n/2+1
        // 짝수가 배정받는 번호 = n/2
        int answer = 0;
        
        // a와 b가 같으면 멈추기
        while(a != b){
            a = a/2 + a%2;
            b = b/2 + b%2;
            answer++;
        }

        return answer;
    }
}
