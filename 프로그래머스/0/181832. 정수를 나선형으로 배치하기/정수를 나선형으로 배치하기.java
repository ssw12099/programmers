class Solution {
    public int[][] solution(int n) {
        int[][] answer = new int[n][n];
        int s = 0,e=n;
        for(int num=1;num<=n*n;){
            for(int i=s;i<e;i++){
                answer[s][i] = num++;
            }
            for(int i=s+1;i<e;i++){
                answer[i][e-1] = num++;
            }
            for(int i=e-2;i>=s;i--){
                answer[e-1][i] = num++;
            }
            for(int i=e-2;i>s;i--){
                answer[i][s] = num++;
            }
            s++;
            e--;
        }
        return answer;
    }
}