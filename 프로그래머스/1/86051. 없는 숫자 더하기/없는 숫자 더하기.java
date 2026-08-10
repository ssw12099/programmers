class Solution {
    public int solution(int[] numbers) {
        int answer = 45;
        for(int i=0;i<numbers.length;answer-=numbers[i++]);
        return answer;
    }
}