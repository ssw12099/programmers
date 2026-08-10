class Solution {
    public int solution(String dartResult) {
        int answer = 0;
        int[] tmp = {0,0};
        for(int i=0;i<dartResult.length();i++){
            int ch = dartResult.charAt(i);
            if(ch=='1'&&dartResult.charAt(i+1)=='0'){
                ch = 10;
                i++;
            }
            if(ch==10||(ch >='0'&&ch<='9')){
                answer += tmp[0];
                tmp[0] = tmp[1];
                tmp[1] = (ch!=10)?ch-'0':ch;
            }else if(ch=='S'||ch=='D'||ch=='T'){
                tmp[1] *= (ch=='D')?tmp[1]:(ch=='T')?(tmp[1]*tmp[1]):1;
            }else if(ch=='*'||ch=='#'){
                tmp[0]*=(ch=='*')?2:1;
                tmp[1]*=(ch=='*')?2:-1;
            }
        }
        answer += (tmp[0]+tmp[1]);
        return answer;
    }
}