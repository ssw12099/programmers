class Solution {
    public long solution(int price, int money, int count) {
        long answer = -1;
        long tmp = 0;
        for(int i=0;i<count;tmp += price*(++i));
        answer = (money - tmp >= 0)?0:(tmp - money);

        return answer;
    }
}