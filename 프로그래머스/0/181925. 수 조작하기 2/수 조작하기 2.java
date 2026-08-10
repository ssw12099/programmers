class Solution {
    public String solution(int[] numLog) {
        String answer = "";
        int flag = numLog[0];
        for(int i=1;i<numLog.length;i++){
            if((flag+1)==numLog[i]){
                flag+=1;
                answer = answer+"w";
            }else if((flag-1)==numLog[i]){
                flag-=1;
                answer = answer+"s";
            }else if((flag+10)==numLog[i]){
                flag+=10;
                answer = answer+"d";
            }else if((flag-10)==numLog[i]){
                flag-=10;
                answer = answer+"a";
            }
        }
        return answer;
    }
}