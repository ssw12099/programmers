class Solution {
    public int solution(int[] sides) {
        int maxIn = 0;
        for(int i=0;i<3;i++){
            maxIn = (sides[maxIn]<sides[i])?i:maxIn;
        }
        int answer = (sides[maxIn]<sides[(maxIn+1)%3]+sides[(maxIn+2)%3])?1:2;
        return answer;
    }
}