class Solution {
    public int solution(int num) {
        int answer = 0;
        long tmp = num;
        for(;answer<500;answer++){
            if(tmp==1)break;
            tmp = (tmp%2==0)?tmp/2:(tmp*3)+1;
        }
        if(answer==500)answer=-1;
        return answer;
    }
}