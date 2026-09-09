import java.util.Arrays;
class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        Arrays.sort(score);
        for(int i=0;i<score.length/m;answer += score[((i++)*m)+(score.length%m)]*m);
        return answer;
    }
}