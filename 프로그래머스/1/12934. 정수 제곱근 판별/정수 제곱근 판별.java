class Solution {
    public long solution(long n) {
        double tmp = Math.sqrt(n);
        long answer = (tmp%1==0)?((long)tmp+1) * ((long)tmp+1):-1;
        return answer;
    }
}