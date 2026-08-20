class Solution {
    public int solution(String s) {
        int[] c = {0,0,0};
        int answer = 0;
        for(int i=0;i<s.length();i++){
            if(c[0]==0)c[0]=s.charAt(i);
            answer+=(s.charAt(i)==c[0])?0*c[1]++:0*c[2]++;
            if(c[1]==c[2]){
                answer++;
                for(int k=0;k<3;c[k++]=0);
            }
        }
        if(c[1]!=c[2])answer++;
        return answer;
    }
}