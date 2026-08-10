class Solution {
    public int solution(int order) {
        int answer = 0;
        for(;order>0;order=(int)order/10){
            answer += (order%10!=0&&order%10%3==0)?1:0;
        }
        return answer;
    }
}