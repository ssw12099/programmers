class Solution {
    public int[] solution(int n) {
        int len = 1;
        for(int i=n;i!=1;i=(i%2+(0*len++)==0)?(i/2):(3*i+1));
        int[] answer = new int[len];
        answer[0]=n;
        for(int i=1;answer[i-1]!=1;answer[i++]=(n%2==0)?(n/=2):(n=3*n+1));
        return answer;
    }
}