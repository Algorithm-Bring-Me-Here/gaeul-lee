import java.util.*;
class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();
        for(int move : moves) {
            int j = move-1;
            
            for(int i=0; i<board.length; i++) {
                if(board[i][j] == 0) continue;
                if(!stack.empty() && stack.peek() == board[i][j]){
                    stack.pop();
                    board[i][j] = 0;
                    answer+=2;
                    break;
                } else {
                    stack.push(board[i][j]);
                    board[i][j] = 0;
                    break;
                }
            }
        }
        return answer;
    }

                    
}
