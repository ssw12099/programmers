class Solution {
    public int[] solution(int n, int[] numlist) {
        int c=0;
        for(int i=0;i<numlist.length;c+=(numlist[i++]%n==0)?1:0);
        int[] answer = new int[c];
        c=0;
        for(int i=0;i<numlist.length;i++){
            if(numlist[i]%n==0)answer[c++]=numlist[i];
        };
        return answer;
    }
}