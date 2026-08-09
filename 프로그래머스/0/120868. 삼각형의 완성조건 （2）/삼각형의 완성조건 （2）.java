import java.util.Arrays;

class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        Arrays.sort(sides);
        //두가지 방법있음
        for(int i=1;i<=sides[1];answer+=((i++)+sides[0]>sides[1])?1:0);
        answer += (sides[0]-1);
        return answer;
    }
}