class Solution {
    public int[] solution(int l, int r) {
        int len = 0;
        for(int i=0;i<=r;i+=5+(0*((i>=l&&(i+"").replaceAll("[50]","").length()==0)?len++:1)));
        int[] answer = new int[len==0?1:len];
        for(int i=0,c=0;i<=r;i+=5+(0*((i>=l&&(i+"").replaceAll("[50]","").length()==0)?(answer[c++]=i):1)));
        if(len==0)answer[0]=-1;
        return answer;
    }
}