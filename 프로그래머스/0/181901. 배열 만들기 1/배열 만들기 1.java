class Solution {
    public int[] solution(int n, int k) {
        int c=0;
        for(int i=1;i<=n;i++){
            if(i%k==0)c++;
        }
        int[] answer = new int[c];
        c=0;
        for(int i=1;i<=n;i++){
            if(i%k==0)answer[c++] = i;
        }
        return answer;
    }
}