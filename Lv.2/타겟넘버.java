class Solution {
    static int answer = 0;
    static int sum = 0;
    public int solution(int[] numbers, int target) {
        dfs(0, 0, numbers, target);
        return answer;
    }
    public void dfs(int sum, int index, int[] numbers, int target){
        if(index == numbers.length && sum == target){
            answer++;
            return;
        }
        if(index >= numbers.length) return;
        dfs(sum + numbers[index], index+1, numbers, target);
        dfs(sum - numbers[index], index+1, numbers, target);
    }
}
