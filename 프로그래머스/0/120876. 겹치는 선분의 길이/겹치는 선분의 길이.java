class Solution {
    public int solution(int[][] lines) {
        int answer = 0;
        int min = Math.min(Math.min(lines[0][0],lines[1][0]),lines[2][0]);
        int max = Math.max(Math.max(lines[0][1],lines[1][1]),lines[2][1]);
        for(int i=min;i<=max;i++){
            if(((lines[0][0]<=i&&i<lines[0][1])?1:0)+((lines[1][0]<=i&&i<lines[1][1])?1:0)+((lines[2][0]<=i&&i<lines[2][1])?1:0)>=2)answer++;
        }
        return answer;
    }
}