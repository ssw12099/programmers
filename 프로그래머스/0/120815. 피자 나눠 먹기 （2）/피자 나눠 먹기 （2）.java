class Solution {
    public int solution(int n) {
        int answer = 1;
        for(int i=1;i<n&&(i*6)%n!=0;answer=++i);
        return answer;
    }
}