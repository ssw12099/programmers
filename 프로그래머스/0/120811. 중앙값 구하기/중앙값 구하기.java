import java.util.Arrays;

class Solution {
    public int solution(int[] array) {
        Arrays.sort(array);
        int answer = array[(array.length)/2];
        //-먼저해야 홀짝 정리된다이
        
        return answer;
    }
}