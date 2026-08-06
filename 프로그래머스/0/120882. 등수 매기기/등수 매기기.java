import java.util.Arrays;
class Solution {
    public int[] solution(int[][] score) {
        for(int i=0;i<score.length;i++){
            score[i][0] = score[i][0]+score[i][1];
            score[i][1] = i;
        }
        Arrays.sort(score, (a, b) -> Integer.compare(b[0], a[0]));
        int[] answer = new int[score.length];
        int dong = 1;
        for (int i = 0; i < score.length; i++) {
            if (i > 0 && score[i][0] != score[i - 1][0]) {
                dong = i + 1;
            }

            answer[score[i][1]] = dong;
        }
        return answer;
    }
}