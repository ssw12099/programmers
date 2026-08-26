import java.util.Arrays;
class Solution {
    public int solution(int[][] board) {
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board.length;j++){
                if(board[i][j]==1){
                    for(int k = (i-1>0)?i-1:0;k<board.length&&k<=i+1;k++){
                        for(int m = (j-1>0)?j-1:0;m<board.length&&m<=j+1;m++){
                            if(board[k][m] == 0) board[k][m] = 2; 
                        }
                    }
                }
            }
        }
        int answer = Arrays.deepToString(board).replaceAll("[^0]","").length();
        
        return answer;
    }
}